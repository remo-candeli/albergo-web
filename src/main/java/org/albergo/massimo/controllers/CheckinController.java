package org.albergo.massimo.controllers;

import lombok.extern.slf4j.Slf4j;
import org.albergo.massimo.dtos.RichiestaDto;
import org.albergo.massimo.exceptions.CamereNonDisponibiliException;
import org.albergo.massimo.models.*;
import org.albergo.massimo.services.AlbergoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Controller
@RequestMapping("/checkin")
public class CheckinController {


    private AlbergoService albergoService;

    @GetMapping("/")
    public String index(Model model) {
        return "check-in";
    }


    @PostMapping("/verifica")
    public String verificaDisponibilita(@Valid @ModelAttribute("richiestaDto") RichiestaDto richiestaDto,
                                      BindingResult bindingResult, Model model) {
        if (!bindingResult.hasErrors()) {
            model.addAttribute("noErrors", true);
        }
        Cliente cliente = new Cliente(richiestaDto.getNome(), richiestaDto.getCognome(),
                Integer.parseInt(richiestaDto.getAdulti()), Integer.parseInt(richiestaDto.getFigli()));

        List<Camera> camereRichieste = new ArrayList<>();
        if (richiestaDto.getCamera1()!=null && !richiestaDto.getCamera1().isEmpty())
            camereRichieste.add(risolveCamera(richiestaDto.getCamera1()));
        if (richiestaDto.getCamera2()!=null && !richiestaDto.getCamera2().isEmpty())
            camereRichieste.add(risolveCamera(richiestaDto.getCamera2()));
        if (richiestaDto.getCamera3()!=null && !richiestaDto.getCamera3().isEmpty())
            camereRichieste.add(risolveCamera(richiestaDto.getCamera3()));
        if (richiestaDto.getCamera4()!=null && !richiestaDto.getCamera4().isEmpty())
            camereRichieste.add(risolveCamera(richiestaDto.getCamera4()));

        Richiesta richiesta = new Richiesta(cliente, richiestaDto.getGiorni(), camereRichieste);
        try {
            albergoService.elaboraRichiesta(richiesta);
        } catch (CamereNonDisponibiliException e) {
            model.addAttribute("noErrors", false);
        }
        model.addAttribute("richiesta", richiestaDto);
        return "check-in";
    }


    private Camera risolveCamera(String tipoCamera) {
        switch (tipoCamera) {
            case "matrimoniale": return new Matrimoniale(false);
            case "matrimoniale_1": return new Matrimoniale(true);
            case "singola": return new Singola();
            case "doppia": return new Doppia();
        }
        return null;
    }

    @Autowired
    public void setAlbergoService(AlbergoService albergoService) {
        this.albergoService = albergoService;
    }
}

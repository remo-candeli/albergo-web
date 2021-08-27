package org.albergo.massimo.controllers;


import lombok.extern.slf4j.Slf4j;
import org.albergo.massimo.dtos.AlloggioDto;
import org.albergo.massimo.dtos.CameraDto;
import org.albergo.massimo.models.*;
import org.albergo.massimo.services.AlbergoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Slf4j
@Controller
@RequestMapping("/alloggi")
public class RegistroAlloggiController {

    private AlbergoService albergoService;

    @GetMapping("/registro")
    public ModelAndView index() {
        List<AlloggioDto> alloggiDto = new ArrayList<>();
        List<Alloggio> alloggi = albergoService.getAlloggi();
        List<Camera> camereAlloggi = Arrays.asList(new Matrimoniale(true), new Singola());
        alloggi.add(new Alloggio(new Cliente("Candeli", "Remo", 4, 2),
                    camereAlloggi, 5));
        for(Alloggio alloggio: alloggi) {
            List<CameraDto> rooms = new ArrayList<>();
            for(Camera camera: alloggio.getCamere()) {
                CameraDto cameraDto = new CameraDto(camera.toString(), camera.getNrPostiLetto());
                rooms.add(cameraDto);
            }
            AlloggioDto alloggioDto = new AlloggioDto(alloggio.getCliente().getCognome(), alloggio.getGiorni(), rooms);
            alloggiDto.add(alloggioDto);
        }

        Map<String, Object> alloggiAlbergo = new HashMap<>();
        alloggiAlbergo.put("lodgings", alloggiDto);
        return new ModelAndView("registro-alloggi", alloggiAlbergo);
    }

    @Autowired
    public void setAlbergoService(AlbergoService albergoService) {
        this.albergoService = albergoService;
    }
}

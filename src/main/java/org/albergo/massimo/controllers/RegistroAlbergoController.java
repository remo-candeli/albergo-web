package org.albergo.massimo.controllers;

import org.albergo.massimo.models.Camera;
import org.albergo.massimo.models.RegistroCamere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/registro")
public class RegistroAlbergoController {

    private RegistroCamere registroCamere;

    @GetMapping("/show")
    public ModelAndView elencaRegistroAlbergo() {
        List<Camera> camere = registroCamere.getCamere();
        Map<String, Object> camereAlbergo = new HashMap<>();
        camereAlbergo.put("rooms", camere);
        return new ModelAndView("camere-albergo", camereAlbergo);
    }

    @Autowired
    public void setRegistroCamere(RegistroCamere registroCamere) {
        this.registroCamere = registroCamere;
    }
}

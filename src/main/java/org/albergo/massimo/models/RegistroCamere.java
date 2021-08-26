package org.albergo.massimo.models;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RegistroCamere {

    private List<Camera> camere;

    public RegistroCamere() {
        int i = 0;
        camere = new ArrayList<>();
        for(i = 1 ; i <= 4; i++) {
            camere.add(new Matrimoniale(i % 2 == 0 ));
        }
        for(i = 1 ; i <= 3; i++) {
            camere.add(new Singola());
        }
        for(i = 1 ; i <= 3; i++) {
            camere.add(new Doppia());
        }
        int k = 0;
        for (Camera camera : camere) {
            camera.setIdCamera( ""+ ++k );
        }
    }

    public List<Camera> getCamere() {
        return this.camere;
    }
}


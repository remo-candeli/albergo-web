package org.albergo.massimo.services;

import lombok.extern.slf4j.Slf4j;
import org.albergo.massimo.models.Alloggio;
import org.albergo.massimo.models.Camera;
import org.albergo.massimo.models.RegistroCamereService;
import org.albergo.massimo.models.Richiesta;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class Assegnazione {

    public List<Camera> verificaDisponibilit√†(Richiesta richiesta, RegistroCamereService registro) {
        List<Camera> result = new ArrayList<>();

        for(Camera cameraRichiesta : richiesta.getCamere()) {
            boolean cameraAggiunta = false;
            for (Camera cameraAlbergo : registro.getCamere()) {
                if((!cameraAlbergo.isOccupata()) && (!result.contains(cameraAlbergo))) {
                    if(cameraAlbergo.verificaCamera(cameraRichiesta)){
                        result.add(cameraAlbergo);
                        cameraAggiunta = true;
                        break;
                    }
                }
            }
            if(!cameraAggiunta)
                log.info("La camera richiesta " + cameraRichiesta + ", non √© disponibile per la famiglia " + richiesta.getCliente().getCognome());
        }
        return result;
    }


    public Alloggio assegnaCamere(Richiesta richiesta, List<Camera> camereRichieste, List<Camera> camereAlbergo) {

        for(Camera cameraAlbergo : camereAlbergo){
            for(Camera camera : camereRichieste) {
                if(cameraAlbergo.equals(camera)) {
                    cameraAlbergo.setOccupata(true);
                    break;
                }
            }
        }
        return new Alloggio(richiesta.getCliente(), camereRichieste, richiesta.getGiorni());
    }
}

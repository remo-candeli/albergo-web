package org.albergo.massimo;

import java.util.ArrayList;
import java.util.List;

public class Assegnazione {

    public List<Camera> verificaDisponibilità(Richiesta richiesta, RegistroCamere registro) {
        List<Camera> result = new ArrayList<>();

        for(Camera cameraRichiesta : richiesta.getCamere()) {

            for (Camera cameraAlbergo : registro.getCamere()) {

                if(!cameraAlbergo.isOccupata()) {

                    if(cameraAlbergo.verificaCamera(cameraRichiesta)){
                        result.add(cameraAlbergo);
                        break;
                    }
                }
            }
        }
        return result;
    }


    public Alloggio assegnaCamere (Cliente cliente, List<Camera> camereRichieste, List<Camera> camereAlbergo) {

        for(Camera cameraAlbergo : camereAlbergo){
            for(Camera camera : camereRichieste) {
                if(cameraAlbergo.equals(camera)) {
                    cameraAlbergo.setOccupata(true);
                }
            }
        }
        return new Alloggio(cliente, camereRichieste, 0);
    }



}

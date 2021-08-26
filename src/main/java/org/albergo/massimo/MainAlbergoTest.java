package org.albergo.massimo;

import lombok.extern.slf4j.Slf4j;
import org.albergo.massimo.exceptions.CamereNonDisponibiliException;
import org.albergo.massimo.models.*;
import org.albergo.massimo.services.AlbergoService;

import java.util.ArrayList;
import java.util.List;


@Slf4j
public class MainAlbergoTest {

    private AlbergoService albergo;



    private void creaRichiesteAlloggioClienti() {
        System.out.println("========= Eventi Check-In =========");
        Cliente cliente;
        List<Camera> camereRichieste = new ArrayList<>();
        camereRichieste.clear();
        cliente = new Cliente("Alberto", "Leopoldi", 2, 1);
        camereRichieste.add(new Matrimoniale(true));
        eseguiRichiesta(cliente, camereRichieste, 3);

        camereRichieste.clear();
        cliente = new Cliente("Franco", "Arciboldi", 3, 2);
        camereRichieste.add(new Matrimoniale(false));
        camereRichieste.add(new Doppia());
        camereRichieste.add(new Singola());
        eseguiRichiesta(cliente, camereRichieste, 4);


        camereRichieste.clear();
        cliente = new Cliente("Gianni", "Maniaco", 1, 0);
        camereRichieste.add(new Singola());
        eseguiRichiesta(cliente, camereRichieste, 4);

        camereRichieste.clear();
        cliente = new Cliente("Nadia", "Comanechi", 1, 0);
        camereRichieste.add(new Singola());
        eseguiRichiesta(cliente, camereRichieste, 5);
        System.out.println("====================================");
        System.out.println();

    }

    private Richiesta eseguiRichiesta(Cliente cliente, List<Camera> camereRichieste, int giorniPermanenza) {
        Richiesta richiesta = new Richiesta(cliente, giorniPermanenza, camereRichieste);
        try {
            albergo.elaboraRichiesta(richiesta);
            System.out.println("La richiesta del cliente "+ cliente.getCognome()+ " é stata accettata");
        } catch (CamereNonDisponibiliException e) {
            System.out.println("La richiesta del cliente "+ cliente.getCognome()+ " non é stata accettata");
        }
        return richiesta;
    }

    private void stampaRegistroAlbergo(int giorno) {
        System.out.println("========= Registro Albergo =========");
        System.out.println("_____________ Giorno " + giorno +" _____________");
        albergo.stampaRegistro();
        System.out.println("====================================");
        System.out.println();
    }
}

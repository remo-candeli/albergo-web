package org.albergo.massimo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main_albergo {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Massimo", "Iosca", 4,0);
        System.out.println(cliente.getCognome());
        log.error("camera non disponibile: " + cliente.getCognome());


    }
}

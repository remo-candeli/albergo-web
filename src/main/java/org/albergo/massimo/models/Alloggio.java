package org.albergo.massimo.models;


import java.util.List;

public class Alloggio {

    private Cliente cliente;
    private List<Camera> camere;
    private int giorni;

    public Alloggio(Cliente cliente, List<Camera> camere, int giorni) {
        this.camere = camere;
        this.cliente = cliente;
        this.giorni = giorni;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Camera> getCamere() {
        return camere;
    }

    public int getGiorni() {
        return giorni;
    }

    //commento post download su pc asus
}

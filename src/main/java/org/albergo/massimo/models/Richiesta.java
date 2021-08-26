package org.albergo.massimo.models;

import org.albergo.massimo.models.Camera;
import org.albergo.massimo.models.Cliente;

import java.util.List;

public class Richiesta {

    private int giorni;
    private org.albergo.massimo.models.Cliente Cliente;
    private List<Camera> camere;

    public Richiesta(Cliente Cliente, int giorni, List<Camera> camere) {
        this.Cliente = Cliente;
        this.giorni = giorni;
        this.camere = camere;
    }



    public int getGiorni() {
        return giorni;
    }

    public void setGiorni(int giorni) {
        this.giorni = giorni;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente cliente) {
        Cliente = cliente;
    }

    public List<Camera> getCamere() {
        return camere;
    }
}
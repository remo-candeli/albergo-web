package org.albergo.massimo.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {

    private String nome;
    private String cognome;
    private int numAdulti = 0;
    private int numFigli = 0;


    public Cliente(String nome, String cognome, int numAdulti, int numFigli) {
        this.nome = nome;
        this.cognome = cognome;
        this.numFigli = numFigli;

    }


}

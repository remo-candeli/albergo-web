package org.albergo.massimo.dtos;

import javax.validation.constraints.NotEmpty;

public class RichiestaDto {
    @NotEmpty
    private String nome;
    @NotEmpty
    private String cognome;
    @NotEmpty
    private String adulti;
    private String figli;
    private int giorni;
    private String camera1;
    private String camera2;
    private String camera3;
    private String camera4;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }


    public String getCamera1() {
        return camera1;
    }

    public void setCamera1(String camera1) {
        this.camera1 = camera1;
    }

    public String getCamera2() {
        return camera2;
    }

    public void setCamera2(String camera2) {
        this.camera2 = camera2;
    }

    public String getCamera3() {
        return camera3;
    }

    public void setCamera3(String camera3) {
        this.camera3 = camera3;
    }

    public String getCamera4() {
        return camera4;
    }

    public void setCamera4(String camera4) {
        this.camera4 = camera4;
    }

    public String getAdulti() {
        return adulti;
    }

    public void setAdulti(String adulti) {
        this.adulti = adulti;
    }

    public String getFigli() {
        return figli;
    }

    public void setFigli(String figli) {
        this.figli = figli;
    }

    public int getGiorni() {
        return giorni;
    }

    public void setGiorni(int giorni) {
        this.giorni = giorni;
    }
}

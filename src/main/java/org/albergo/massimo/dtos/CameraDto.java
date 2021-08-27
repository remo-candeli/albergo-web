package org.albergo.massimo.dtos;

public class CameraDto {

    private String tipoCamera;
    private int nrPostiLetto;

    public CameraDto() {
    }

    public CameraDto(String tipoCamera, int nrPostiLetto) {
        this.tipoCamera = tipoCamera;
        this.nrPostiLetto = nrPostiLetto;
    }

    public String getTipoCamera() {
        return tipoCamera;
    }

    public void setTipoCamera(String tipoCamera) {
        this.tipoCamera = tipoCamera;
    }

    public int getNrPostiLetto() {
        return nrPostiLetto;
    }

    public void setNrPostiLetto(int nrPostiLetto) {
        this.nrPostiLetto = nrPostiLetto;
    }
}

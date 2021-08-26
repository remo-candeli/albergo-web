package org.albergo.massimo.models;

import java.util.Objects;

abstract public class Camera {

    private String idCamera;
    private boolean occupata = false;
    private int nrLettiSingoli = 0;
    private int nrLettiMatrimoniali = 0;
    private int nrLettiAggiuntivi = 0;

    public Camera(int nrLettiSingoli, int nrLettiMatrimoniali, int nrLettiAggiuntivi) {
        this.nrLettiSingoli = nrLettiSingoli;
        this.nrLettiMatrimoniali = nrLettiMatrimoniali;
        this.nrLettiAggiuntivi = nrLettiAggiuntivi;
    }

    abstract public Integer getNrPostiLetto();
    abstract public boolean verificaCamera(Camera camera);

    public int getNrLettiSingoli() {
        return nrLettiSingoli;
    }

    public int getNrLettiMatrimoniali() {
        return nrLettiMatrimoniali;
    }

    public boolean isOccupata() {
        return occupata;
    }

    public void setOccupata(boolean occupata) {
        this.occupata = occupata;
    }

    public String getIdCamera() {
        return idCamera;
    }

    public int getNrLettiAggiuntivi() {
        return nrLettiAggiuntivi;
    }

    public void setIdCamera(String idCamera) {
        this.idCamera = idCamera;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Camera camera = (Camera) o;
        return idCamera.equals(camera.idCamera);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCamera);
    }
}

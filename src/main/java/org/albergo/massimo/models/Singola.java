package org.albergo.massimo.models;

public class Singola extends Camera {

    public Singola () {
        super(1, 0, 0);
    }

    @Override
    public Integer getNrPostiLetto() {
        return 1;
    }

    @Override
    public boolean verificaCamera(Camera camera) {
        if(this.getClass().equals(camera.getClass())){
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "Camera Singola";
    }
}

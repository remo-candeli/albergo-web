package org.albergo.massimo;

public class Doppia extends Camera {

    public Doppia() {
        super(2, 0, 0);
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
        return "Camera Doppia";
    }
}
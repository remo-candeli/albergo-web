package org.albergo.massimo;

public class Singola extends Camera {

    public Singola () {
        super(1, 0, 0);
    }

    @Override
    public boolean verificaCamera(Camera camera) {
        if(this.getClass().equals(camera.getClass())){
            return true;
        }
        return false;
    }
}

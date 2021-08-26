package org.albergo.massimo.models;

public class Matrimoniale extends Camera {

    public Matrimoniale(boolean lettoAggiuntivo) {
        super(0, 1, (lettoAggiuntivo? 1 : 0) );

    }

    @Override
    public Integer getNrPostiLetto() {
        return 2 + this.getNrLettiAggiuntivi();
    }


    public boolean verificaCamera(Camera camera) {
        if(this.getClass().equals(camera.getClass())) {
            if (this.getNrLettiAggiuntivi() == camera.getNrLettiAggiuntivi())
                return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return "Matrimoniale con letti aggiuntivi " + this.getNrLettiAggiuntivi();
    }
}

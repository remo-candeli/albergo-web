package org.albergo.massimo;

public class Matrimoniale extends Camera {

    public Matrimoniale(boolean lettoAggiuntivo) {
        super(0, 1, (lettoAggiuntivo? 1 : 0) );

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

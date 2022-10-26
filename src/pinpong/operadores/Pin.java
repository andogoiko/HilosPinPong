package pinpong.operadores;

import pinpong.hilos.Pelota;

public class Pin implements Runnable{

    private Pelota partidisimo;
    private String jugadol;

    public Pin(Pelota partidisimo, String jugadol){
        this.partidisimo = partidisimo;
        this.jugadol = jugadol;
    }

    @Override
    public void run(){
        try {
            partidisimo.turnT1(jugadol);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

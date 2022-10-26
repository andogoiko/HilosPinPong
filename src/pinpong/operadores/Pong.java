package pinpong.operadores;

import pinpong.hilos.Pelota;

public class Pong implements  Runnable{

    private Pelota partidisimo;
    private String jugadol;

    public Pong(Pelota partidisimo, String jugadol){
        this.partidisimo = partidisimo;
        this.jugadol = jugadol;
    }

    @Override
    public void run(){
        try {
            partidisimo.turnT2(jugadol);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

package pinpong.hilos;

import static java.lang.Thread.sleep;

public class Pelota {

    private boolean turnTeam1 = true;

    public void turnT1(String jugador) throws InterruptedException {

        while(true){
            synchronized (Pelota.this){
                while (!turnTeam1){
                    wait();
                }
                System.out.println(jugador + " pin");
                turnTeam1 = false;
                sleep(1000);
                notifyAll();
            }
        }

    }

    public void turnT2(String jugador) throws InterruptedException {

        while (true){
            synchronized (Pelota.this){
                while (turnTeam1){
                    wait();
                }
                System.out.println(jugador + " pong");
                turnTeam1 = true;
                sleep(1000);
                notifyAll();
            }
        }
    }



}

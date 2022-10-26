package pinpong;

import pinpong.hilos.Pelota;
import pinpong.operadores.Pin;
import pinpong.operadores.Pong;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) throws InterruptedException {

        Pelota partidisimo = new Pelota();

        System.out.println("Está usted a punto de ver un partido de pinpong que pasará a los anales de la historia. Siéntese y disfrute del espectáculo");

        ArrayList<Thread> mesaPinPong = new ArrayList<>();

        mesaPinPong.add(new Thread(new Pin(partidisimo, "Equipo1 j1")));
        mesaPinPong.add(new Thread(new Pong(partidisimo, "Equipo2 j1")));
        mesaPinPong.add(new Thread(new Pin(partidisimo, "Equipo1 j2")));
        mesaPinPong.add(new Thread(new Pong(partidisimo, "Equipo2 j2")));
        mesaPinPong.add(new Thread(new Pin(partidisimo, "Equipo1 j3")));
        mesaPinPong.add(new Thread(new Pong(partidisimo, "Equipo2 j3")));

        for (Thread partidazo: mesaPinPong) {

            partidazo.start();
        }
        for (int i = 0; i < mesaPinPong.size(); i++){
            mesaPinPong.get(i).join();
        }

        System.out.printf("El partido nunca acaba jiji");

    }
}

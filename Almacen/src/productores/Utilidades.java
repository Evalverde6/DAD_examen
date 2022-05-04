package productores;

import java.util.Random;

public class Utilidades {
    public static int numAzar(int numAzar){
        Random NumAleatorio = new Random();
        return NumAleatorio.nextInt(numAzar);
    }

    public static void esperarTiempoAzar(int esperarTiempoAzar){
    	Random NumAleatorio = new Random();
  
    	try {
            Thread.sleep(NumAleatorio.nextInt(esperarTiempoAzar));
        }catch (InterruptedException ex){
            System.out.println("Falló la espera");
        }
    }
}
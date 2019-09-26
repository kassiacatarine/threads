package br.edu.utfpr.sd;

public class ThreadContador implements Runnable {
    private int id;

    public ThreadContador(int id) {
        this.id = id;
    }

    public void pausarThread(int tempo){
        try {
            Thread.sleep((int) (tempo * 1000));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private int numeroAleatorio(int min, int max){
        int randomNum = min + (int)(Math.random() * (max - min));
    
        return randomNum;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            int num = numeroAleatorio(0, 3);
            System.out.println("Programa " + id + " valor: " + i +" tempo de pausa: " + num);
            pausarThread(num);
        }
    }
}
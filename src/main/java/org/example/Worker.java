package org.example;

public class Worker extends Thread {
    private int id;
    private Data data;

    public Worker(int id, Data d) {
        this.id = id;
        data = d;
        this.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            if (id == 1) {
                data.Tic();
            } else if (id == 2) {
                data.Tak();
            } else if (id == 3) {
                data.Toy();
            }
        }
    }
}

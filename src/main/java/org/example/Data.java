package org.example;

public class Data {
    private int turn = 1;

    public synchronized void Tic() {
        while (turn != 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.print("Tic-");
        turn = 2;
        notifyAll();
    }

    public synchronized void Tak() {
        while (turn != 2) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.print("Tak-");
        turn = 3;
        notifyAll();
    }

    public synchronized void Toy() {
        while (turn != 3) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Toy");
        turn = 1;
        notifyAll();
    }
}


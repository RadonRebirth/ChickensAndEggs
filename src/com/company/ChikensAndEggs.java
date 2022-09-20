package com.company;

class Item extends Thread {
    public Item(String name) {
        this.name = name;
    }
    String name;
    public void run() {

        for(int i = 0; i<5;i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(name);
        }
    }
}
public class ChikensAndEggs {
    public static void main(String args[]) throws InterruptedException {
        Item Chicken = new Item("Курица");
        Item Egg = new Item("Яйцо");

        Chicken.start();
        Egg.start();

        try {
            Chicken.join();
            if (Egg.isAlive()) {
                Egg.join();
                System.out.println("Победило яйцо");
            } else {
                System.out.println("Победила курица");
            }
        } catch (InterruptedException e){
            }
    }
}

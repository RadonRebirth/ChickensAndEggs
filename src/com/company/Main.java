package com.company;

class TThread extends Thread {

    TThread(String name) {
        super(name);
    }
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
public class Main{
    public static void main(String args[]){
        for(int i = 0; i < 10; i ++) {
            new TThread("Thread" + i).start();
        }
        Thread currentThread = Thread.currentThread();
        System.out.println("Thread: " + currentThread.getName());
    }
}

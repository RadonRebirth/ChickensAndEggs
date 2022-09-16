package com.company;

class Animal extends Thread {

    public Animal(String name,int newPriority) {
        this.name = name;
        this.newPriority = newPriority;
    }
    int finish = 1100;
    int distance = -100;
    int newPriority;
    String name;
    public void run() {
        for(int i = 0; i<finish;i+=100){
            distance+=100;
            Animal.currentThread().setPriority(newPriority);
            System.out.println(name + " пробежал(а): " + distance + " метров");
        }
    }
}
public class RabbitAndTurtle{
    public static void main(String args[]){
        Animal rabbit = new Animal("Кролик",Thread.MIN_PRIORITY);
        Animal turtle = new Animal("Черепаха",Thread.MAX_PRIORITY);
        rabbit.start();
        turtle.start();
    }
}

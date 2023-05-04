package com.welcometodannyland.strategy;

public class Mallard extends Duck {
    public Mallard() {
        this.flyBehavior = new IFlyWithMyWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallard duck!");
    }
}

package com.welcometodannyland.strategy;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack, quack!");
    }
}

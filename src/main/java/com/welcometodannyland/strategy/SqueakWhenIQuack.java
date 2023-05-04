package com.welcometodannyland.strategy;

public class SqueakWhenIQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak, squeak!");
    }
}

package com.welcometodannyland.strategy;

public class WingsButDontFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I have wings, but I don't fly!");
    }
}

package com.welcometodannyland.strategy;

public class FlyWithAJetpack implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a jetpack!");
    }
}

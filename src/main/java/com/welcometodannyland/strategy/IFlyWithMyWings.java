package com.welcometodannyland.strategy;

public class IFlyWithMyWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Watch me fly with my wings!");
    }
}

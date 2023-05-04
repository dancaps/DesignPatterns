package com.welcometodannyland.strategy;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new Mallard();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        System.out.println("Putting on my jetpack!");
        mallard.setFlyBehavior(new FlyWithAJetpack());
        mallard.performFly();
    }
}

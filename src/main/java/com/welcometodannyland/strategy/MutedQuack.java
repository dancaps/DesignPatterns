package com.welcometodannyland.strategy;

public class MutedQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("No sound comes out!");
    }
}

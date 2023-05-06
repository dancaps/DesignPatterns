package com.welcometodannyland.observer;

public class Data1Display implements Observer, Display {
    double data1;

    public void display() {
        System.out.println("<== Observer: Data1Display");
        System.out.println("    data1: " + data1);
    }

    @Override
    public void update(double data1, double data2, double data3) {
        this.data1 = data1;
        display();
    }
}

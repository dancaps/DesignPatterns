package com.welcometodannyland.observer;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Data implements Subject {
    List<Observer> observers;
    double data1;
    double data2;
    double data3;

    public Data() {
        observers = new LinkedList<>();
        data1 = 101.1;
        data2 = 204.1;
        data3 = 319.5;
    }

    public double getData1() {
        return data1;
    }

    public double getData2() {
        return data2;
    }

    public double getData3() {
        return data3;
    }

    public void notifyObserver() {
        for (Observer o : observers) {
            o.update(this.data1, this.data2, this.data3);
        }
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void setData() {
        Random random = new Random();
        this.data1 = random.nextDouble(1000);
        this.data2 = random.nextDouble(1000);
        this.data3 = random.nextDouble(1000);
        notifyObserver();
    }
}

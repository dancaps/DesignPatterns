package com.welcometodannyland.observer;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver(); // I'm only sending the data for now.
}

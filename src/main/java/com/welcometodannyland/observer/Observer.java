package com.welcometodannyland.observer;

public interface Observer {
    /**
     * The subject is only sending data to observers for now. This will change to a pull method later.
     */
    void update(double data1, double data2, double data3);
}

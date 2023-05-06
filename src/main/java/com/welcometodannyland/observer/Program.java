package com.welcometodannyland.observer;

public class Program {

    public static void main(String[] args) {
        Data data = new Data();
        Data1Display data1Display = new Data1Display();

        System.out.println("<== Adding the observer data1Display");
        data.registerObserver(data1Display);

        System.out.println("<== Adding data to the subject, which will update the observer and\n" +
                               "\tthe observer will display the new data.");
        data.setData();

        System.out.println("<== Updating new data to the subject");
        data.setData();

        System.out.println("<== Removing the data1Display observer");
        data.removeObserver(data1Display);

        System.out.println("<== Updating new data to the subject for a third time, which shouldn't display anything.");
        data.setData();
    }
}

package org.example.task02;

public class Main {
    public static void main(String[] args) {
        Tractor tractor = new Tractor("red", 4, 12);
        System.out.println(tractor);
        tractor.startDriving();
    }
}

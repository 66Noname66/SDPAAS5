package org.example;

public class Main {
    public static void main(String[] args) {
        String start = "Astana IT University";
        String destination = "Khan Shatyr";

        Navigator navigator = new Navigator(new CarStrategy());

        System.out.println("      Initial strategy: Car  ");
        navigator.navigate(start, destination);

        System.out.println("\n      Switch strategy: Walking   ");
        navigator.setStrategy(new WalkStrategy());
        navigator.navigate(start, destination);

        System.out.println("\n      Switch strategy: Cycling   ");
        navigator.setStrategy(new CycleStrategy());
        navigator.navigate(start, destination);
    }
}

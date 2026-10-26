package org.example;

public class CycleStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String start, String destination) {
        System.out.println("Cycling route: " + start + " -> " + destination);
        System.out.println("Directions: prefer cycle lanes and bike-friendly roads.");
    }
}

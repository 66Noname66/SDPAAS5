package org.example;

public class CarStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String start, String destination) {
        System.out.println("Car route: " + start + " -> " + destination);
        System.out.println("Directions: use roads suitable for cars.");
    }
}

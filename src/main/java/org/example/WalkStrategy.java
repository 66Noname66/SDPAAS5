package org.example;

public class WalkStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String start, String destination) {
        System.out.println("Walking route: " + start + " -> " + destination);
        System.out.println("Directions: prefer pedestrian paths and crossings.");
    }
}

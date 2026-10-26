package org.example;

import java.util.Objects;

public class Navigator {
    private RouteStrategy strategy;

    public Navigator(RouteStrategy strategy) {
        setStrategy(strategy);
    }

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = Objects.requireNonNull(strategy, "Route strategy cannot be null");
    }

    public void navigate(String start, String destination) {
        Objects.requireNonNull(start, "Start location cannot be null");
        Objects.requireNonNull(destination, "Destination cannot be null");

        if (start.isBlank() || destination.isBlank()) {
            throw new IllegalArgumentException("Start and destination must not be blank.");
        }

        strategy.buildRoute(start, destination);
    }
}

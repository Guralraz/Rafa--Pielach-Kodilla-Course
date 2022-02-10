package com.kodilla.good_patterns.flights;

import java.util.Objects;

public class Flight {

    private String startingPoint;

    private String destinationPoint;

    public Flight(String startingPoint, String destinationPoint) {
        this.startingPoint = startingPoint;
        this.destinationPoint = destinationPoint;
    }

    public String getStartingPoint() {
        return startingPoint;
    }

    public String getDestinationPoint() {
        return destinationPoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(startingPoint, flight.startingPoint) && Objects.equals(destinationPoint, flight.destinationPoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startingPoint, destinationPoint);
    }

    @Override
    public String toString() {
        return "Flight " + startingPoint + "-" + destinationPoint;
    }

}

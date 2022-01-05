package com.kodilla.exception.test;

public class FlightFinderRunner {

    public static void main(String[] args) {
        Flight flight = new Flight("JFK", "WAW");

        try {
            FlightFinder flightFinder = new FlightFinder();
            flightFinder.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }
    }

}

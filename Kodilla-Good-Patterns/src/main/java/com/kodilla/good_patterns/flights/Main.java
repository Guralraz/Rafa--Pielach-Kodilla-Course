package com.kodilla.good_patterns.flights;

public class Main {

    public static void main(String[] args) {
        VerySmallAirway verySmallAirway = new VerySmallAirway();
        FlightFinder flightFinder = new FlightFinder(verySmallAirway);
        verySmallAirway.addFlight(new Flight("Warsaw", "Cracow"));
        verySmallAirway.addFlight(new Flight("Warsaw", "Gdansk"));
        verySmallAirway.addFlight(new Flight("Warsaw", "Katowice"));
        verySmallAirway.addFlight(new Flight("Gdansk", "Cracow"));
        verySmallAirway.addFlight(new Flight("Cracow", "Wroclaw"));
        System.out.println(verySmallAirway.getFlights());
        flightFinder.flightsFromSearchedLocation("Warsaw");
        flightFinder.flightsToSearchedLocation("Cracow");
        flightFinder.flightsFromAToB("Gdansk", "Wroclaw");
    }

}

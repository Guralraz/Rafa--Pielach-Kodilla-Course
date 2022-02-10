package com.kodilla.good_patterns.flights;

public class Main {

    public static void main(String[] args) {
        VerySmallAirway verySmallAirway = new VerySmallAirway();
        FlightFinder flightFinder = new FlightFinder(verySmallAirway);
        FlightListPopulatingTool flightListPopulatingTool = new FlightListPopulatingTool(verySmallAirway);
        flightListPopulatingTool.listPopulatingTool();
        System.out.println(verySmallAirway.getFlights());
        flightFinder.flightsFromSearchedLocation("Warsaw");
        flightFinder.flightsToSearchedLocation("Cracow");
        flightFinder.flightsFromAToB("Gdansk", "Wroclaw");
    }

}
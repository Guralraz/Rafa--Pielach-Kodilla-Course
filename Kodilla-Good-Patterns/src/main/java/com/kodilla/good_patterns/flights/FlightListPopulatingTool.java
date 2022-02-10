package com.kodilla.good_patterns.flights;

public class FlightListPopulatingTool {

    private VerySmallAirway verySmallAirway;

    public FlightListPopulatingTool(VerySmallAirway verySmallAirway) {
        this.verySmallAirway = verySmallAirway;
    }

    public void listPopulatingTool() {
        verySmallAirway.addFlight(new Flight("Warsaw", "Cracow"));
        verySmallAirway.addFlight(new Flight("Warsaw", "Gdansk"));
        verySmallAirway.addFlight(new Flight("Warsaw", "Katowice"));
        verySmallAirway.addFlight(new Flight("Gdansk", "Cracow"));
        verySmallAirway.addFlight(new Flight("Cracow", "Wroclaw"));
    }

}

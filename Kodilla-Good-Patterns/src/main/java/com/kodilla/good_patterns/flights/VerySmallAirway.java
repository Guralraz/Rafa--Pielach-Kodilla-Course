package com.kodilla.good_patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class VerySmallAirway {

    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public List<Flight> getFlights() {
        return flights;
    }

}

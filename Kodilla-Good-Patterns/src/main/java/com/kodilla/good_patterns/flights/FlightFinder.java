package com.kodilla.good_patterns.flights;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FlightFinder {

    private VerySmallAirway verySmallAirway;

    public FlightFinder(VerySmallAirway verySmallAirway) {
        this.verySmallAirway = verySmallAirway;
    }

    public List<Flight> flightsFromSearchedLocation(String startingPoint) {
        List<Flight> flightsFromSearchedLocation = verySmallAirway.getFlights().stream()
                .filter(flight -> flight.getStartingPoint().equals(startingPoint))
                .collect(Collectors.toList());
        if (flightsFromSearchedLocation.size() > 0) {
            System.out.println(flightsFromSearchedLocation);
        } else {
            System.out.println("No flights found");
        }
        return flightsFromSearchedLocation;
    }

    public List<Flight> flightsToSearchedLocation(String destinationPoint) {
        List<Flight> flightsToSearchedLocation = verySmallAirway.getFlights().stream()
                .filter(flight -> flight.getDestinationPoint().equals(destinationPoint))
                .collect(Collectors.toList());
        if (flightsToSearchedLocation.size() > 0) {
            System.out.println(flightsToSearchedLocation);
        } else {
            System.out.println("No flights found");
        }
        return flightsToSearchedLocation;
    }

    public void flightsFromAToB(String startingPoint, String destinationPoint) {
        if (verySmallAirway.getFlights().contains(new Flight(startingPoint, destinationPoint))) {
            this.flightsFromToSearchedLocation(startingPoint, destinationPoint);
        } else {
            this.flightsFromAToBThroughC(startingPoint, destinationPoint);
        }
    }

    public List<Flight> flightsFromToSearchedLocation(String startingPoint, String destinationPoint) {
        List<Flight> flightsFromToSearchedLocation = verySmallAirway.getFlights().stream()
                .filter(flight -> flight.getStartingPoint().equals(startingPoint))
                .filter(flight -> flight.getDestinationPoint().equals(destinationPoint))
                .collect(Collectors.toList());
        if (flightsFromToSearchedLocation.size() > 0) {
            System.out.println(flightsFromToSearchedLocation);
        } else {
            System.out.println("No flights found");
        }
        return flightsFromToSearchedLocation;
    }

    public Set<Flight> flightsFromAToBThroughC(String startingPoint, String destinationPoint) {
        Set<Flight> flightsFromAToBThroughC = new HashSet<>();
        List<Flight> flightsFromSearchedLocation = verySmallAirway.getFlights().stream()
                .filter(flight -> flight.getStartingPoint().equals(startingPoint))
                .collect(Collectors.toList());
        List<Flight> flightsToSearchedLocation = verySmallAirway.getFlights().stream()
                .filter(flight -> flight.getDestinationPoint().equals(destinationPoint))
                .collect(Collectors.toList());
        for (Flight flight : flightsFromSearchedLocation) {
            for (Flight flight1 : flightsToSearchedLocation) {
                if (flight.getDestinationPoint().equals(flight1.getStartingPoint())) {
                    flightsFromAToBThroughC.add(flight);
                    flightsFromAToBThroughC.add(flight1);
                }
            }
        }
        if (flightsFromAToBThroughC.size() > 0) {
            System.out.println(flightsFromAToBThroughC);
        } else {
            System.out.println("No flights found");
        }
        return flightsFromAToBThroughC;
    }

}

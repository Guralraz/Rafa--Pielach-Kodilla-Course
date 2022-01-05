package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public Map.Entry<String, Boolean> findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> destinations = new HashMap<>();
        destinations.put("ATL", true);
        destinations.put("PEK", true);
        destinations.put("LAX", true);
        destinations.put("JFK", true);
        destinations.put("DXB", true);
        destinations.put("HND", true);
        destinations.put("ORD", true);
        destinations.put("LHR", true);
        destinations.put("PVG", true);
        destinations.put("CDG", true);
        destinations.put("FFW", true);

        if (destinations.containsKey(flight.getArrivalAirport())) {
            Map.Entry<String, Boolean> destinationAirport = null;
            for (Map.Entry<String, Boolean> destination : destinations.entrySet()) {
                if (destination.getKey().equals(flight.getArrivalAirport())) {
                    destinationAirport = destination;
                }
            }
            return destinationAirport;
        } else {
            throw new RouteNotFoundException("Destination not found");
        }
    }

}

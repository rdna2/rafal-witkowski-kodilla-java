package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    private final Map<String, Boolean> airportsConnection = new HashMap<>();

    public FlightSearch() {
        airportsConnection.put("Warsaw", true);
        airportsConnection.put("Madrid", true);
        airportsConnection.put("Moscow", false);
        airportsConnection.put("Prague", true);
        airportsConnection.put("Helsinki", true);
          }

    private boolean findAirport(String airportName) throws RouteNotFoundException {
        if (airportsConnection.containsKey(airportName)) {
            return airportsConnection.get(airportName);
        } else {
            throw new RouteNotFoundException("No match for the airport");
        }
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        return findAirport(flight.getArrivalAirport()) && findAirport(flight.getDepartureAirport());
    }





}

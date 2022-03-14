package com.kodilla.good.patterns.challenges.flights;

import java.util.List;

public class Application {

    static String airportOfDeparture = "Gdansk";
    static String airportOfArrival = "Wroclaw";
    static String airportOfTransit = "Krakow";


    public static void main(String[] args) {
        FlightDatabase flightsFromAirport = new FlightDatabase();
        List<Flights> fromAirport = flightsFromAirport.connectionsFrom(airportOfDeparture);
        System.out.println("\nFlights from Gdansk airport: " + "\n" + fromAirport);

        FlightDatabase flightsToAirport = new FlightDatabase();
        List<Flights> toAirport = flightsToAirport.connectionsTo(airportOfArrival);
        System.out.println("\nFlights to Wroclaw: " + "\n" + toAirport);

        FlightDatabase transitFlights = new FlightDatabase();
        List<Flights> transitAirport = transitFlights.connectionsInTransit(airportOfDeparture, airportOfTransit, airportOfArrival);
        System.out.println("\nFlights from Gdansk to Wroclaw airport in transit through: " + airportOfTransit + "\n" + transitAirport + " then to: " + airportOfArrival);
    }


}

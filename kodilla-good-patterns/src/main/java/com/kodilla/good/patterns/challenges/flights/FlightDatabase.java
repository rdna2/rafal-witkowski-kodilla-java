package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlightDatabase {

    public final List<Flights> connections = new ArrayList<>();

    public FlightDatabase() {
        connections.add(new Flights("Gdansk", "Berlin"));
        connections.add(new Flights("Gdansk",  "Krakow"));
        connections.add(new Flights("Gdansk", "Wroclaw"));
        connections.add(new Flights("Lodz", "Wroclaw"));
        connections.add(new Flights("Gdansk",  "Lodz"));
        connections.add(new Flights("Wroclaw", "Radom"));
        connections.add(new Flights("Warszawa", "Gdansk"));
        connections.add(new Flights("Radom", "Gdansk"));
        connections.add(new Flights("Berlin", "Wroclaw"));
        connections.add(new Flights("Warszawa", "Wroclaw"));
    }
    public List<Flights> connectionsFrom(String departureAirport) {

        return connections.stream()
                .filter(e -> e.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());
    }

    public List<Flights> connectionsTo(String arrivalAirports) {
        return connections.stream()
                .filter(e -> e.getArrivalAirport().equals(arrivalAirports))
                .collect(Collectors.toList());
    }

    public List<Flights> connectionsInTransit(String departureAirports, String transitAirport, String arrivalAirports) {
        return Stream.concat(
                        connectionsFrom(departureAirports).stream().filter(e -> e.getArrivalAirport().equals(transitAirport)),
                        connectionsTo(arrivalAirports).stream().filter(e -> e.getDepartureAirport().equals(transitAirport)))
                .collect(Collectors.toList());

    }



}
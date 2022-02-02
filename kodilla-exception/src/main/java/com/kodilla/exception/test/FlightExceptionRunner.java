package com.kodilla.exception.test;

public class FlightExceptionRunner {
    public static void main(String[] args) {
        Flight WarsawMadrid = new Flight("Warsaw", "Madrid");
        Flight MoscowPrague = new Flight("Moscow", "Prague");
        Flight HelsinkiRome = new Flight("Helsinki", "Rome");

        FlightSearch flightSearch = new FlightSearch();

        try {
            boolean connectionWarsawMadrid = flightSearch.findFlight(WarsawMadrid);
            System.out.println("Flight Warsaw to Madrid: " + connectionWarsawMadrid);
        } catch (RouteNotFoundException e) {
            System.out.println("Please input proper airport name.");
        }

        try {
            boolean connectionMoscowPrague = flightSearch.findFlight(MoscowPrague);
            System.out.println("Flight Moscow to Prague: " + connectionMoscowPrague);
        } catch (RouteNotFoundException e) {
            System.out.println("Please input proper airport name.");
        }

        try {
            boolean connectionHelsinkiRome = flightSearch.findFlight(HelsinkiRome);
            System.out.println("Flight Helinki to Rome: " + connectionHelsinkiRome);
        } catch (RouteNotFoundException e) {
            System.out.println("Please input proper airport name.");
        }

    }
}
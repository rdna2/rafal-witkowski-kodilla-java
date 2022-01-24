package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    public void getPeopleQuantity() {
        //Given
        World world = new World();

        Continent northAmerica = new Continent("NorthAmerica");
        Continent europa = new Continent("Europa");
        Continent asia = new Continent ("Asia");
        world.addContinents(northAmerica);
        world.addContinents(europa);
        world.addContinents(asia);
        world.addContinents(new Continent("NorthAmerica"));
        world.addContinents(new Continent("Europa"));
        world.addContinents(new Continent ("Asia"));
        List<Country> countriesList = new ArrayList<>();
        countriesList.add(new Country("USA", new BigDecimal("340000000")));
        countriesList.add(new Country("Germany", new BigDecimal("80000000")));
        countriesList.add(new Country("India", new BigDecimal("1000000000")));
        Country usa = new Country("USA", new BigDecimal("340000000"));
        Country germany = new Country("Germany", new BigDecimal("80000000"));
        Country india = new Country("India", new BigDecimal("1000000000"));
        northAmerica.addCountry(usa);
        europa.addCountry(germany);
        asia.addCountry(india);
        //When
        BigDecimal expectedPeople = new BigDecimal("1420000000");
        //Then
        assertEquals(expectedPeople, world.getPeopleQuantity());
    }
}
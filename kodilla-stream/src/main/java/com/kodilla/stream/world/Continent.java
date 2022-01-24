package com.kodilla.stream.world;

import java.util.List;
import java.util.Objects;

public final class Continent {
    private final String continentName;
    private final List<Country> countryList;

    public Continent(final String continentName, final List<Country> countryList) {
        this.continentName = continentName;
        this.countryList = countryList;
    }
    public String getContinentName() {
        return continentName;
    }
    public List<Country> getCountryList() {
        return countryList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return continentName.equals(continent.continentName) && countryList.equals(continent.countryList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(continentName, countryList);
    }
}
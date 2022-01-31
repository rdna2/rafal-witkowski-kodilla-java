package com.kodilla.rps;

public class List {

    private final String humanToken;
    private final String compToken;
    private final String duelDescription;

    public List(final String humanToken, final String compToken, final String duelDescription) {
        this.humanToken = humanToken;
        this.compToken = compToken;
        this.duelDescription = duelDescription;
    }

    public String getHumanToken() {
        return humanToken;
    }

    public String getCompToken() {
        return compToken;
    }

    public String getDuelDescription() {
        return duelDescription;
    }

    @Override
    public String toString() {
        return "List{" +
                "duelDescription='" + duelDescription + '\'' +
                '}';
    }
}

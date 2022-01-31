package com.kodilla.rps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Rules {
    
        
        private final ArrayList<List> duelResults;
        private final String winner;

    public Rules(final ArrayList<List> duelResults, final String winner) {
        this.duelResults = duelResults;
        this.winner = winner;
    }

    public ArrayList<List> getDuelResults() {
        return duelResults;
    }

    public String getWinner() {
        return winner;
    }

    @Override
    public String toString() {
        return "Rules{" +
                "duelResults=" + duelResults +
                ", winner=" + winner +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rules rules = (Rules) o;
        return duelResults.equals(rules.duelResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(duelResults);
    }
}

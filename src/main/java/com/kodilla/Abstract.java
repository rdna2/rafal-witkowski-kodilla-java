package com.kodilla;

import java.time.LocalTime;
import java.util.ArrayList;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;




class Clocks {
    public int hour;
    public int minute;

    public Clocks(int hour, int minute) {
        this.hour = hour;
        this.minute= minute;
    }

    public int getHour() {
        return hour;
    }
    public int getMinute(){
        return minute;
    }

    public String toString() {
        return hour + ":" + minute;
    }

}

class ClockSet {
    public static void main(String[] args) {

        Instant now = Instant.now();
        LocalDateTime ldt = LocalDateTime.ofInstant(now, ZoneId.systemDefault());
        int hour = ldt.getHour();
        int minute = ldt.getMinute();
        List<Clocks> clocks = new LinkedList<>();
        clocks.add(new Clocks(hour, minute));
        clocks.add(new Clocks(hour+1,minute));


        System.out.println(clocks);
    }
}
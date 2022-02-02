package com.kodilla.exception.index;

import java.util.List;

public class IndexExceptionRunner {

    public static void main(String[] args) {
        VideoCollector videoCollector = new VideoCollector();
        List<String> collection = videoCollector.getCollection();

        String movie = collection.get(0);
        if (collection.size() > 2) {

            System.out.println(movie);

            String anotherMovie = collection.get(2);
            System.out.println(anotherMovie);
        } else {
            System.out.println(movie);
        }
    }
}
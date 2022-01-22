package com.kodilla.stream;


import stream.beautifier.PoemBeautifier;

public class StreamMain {

    public static void main(String[] args) {
        PoemBeautifier poemBeautified = new PoemBeautifier();

        System.out.println("PoemBeautifying procedure: ");
        poemBeautified.beautify("Beautiful Evening", "  - Indeed, it is.", (words,decoration) -> words + decoration);
        poemBeautified.beautify(" Beautiful Evening ", "ABC", (words,decoration) -> decoration + words + decoration);
        poemBeautified.upper("Beautiful Evening ", " - Indeed, it is", (words,decoration) -> words + decoration);
        poemBeautified.subsequence("Beautiful Evening ", " - Evening to you", (words,decoration) -> words + decoration);
        poemBeautified.replaceAll("Beautiful Evening ", " - Evening to you", (words,decoration) -> words + decoration);
    }
}
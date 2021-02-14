package edu.isu.cs.cs2263.hw02;
import java.util.StringTokenizer;

public class Driver {
    public static void main(String[] args) {
        String test = "This is a test string. . With some super sick test sentences. Dinosaurs are super cool. lol";
        StringTokenizer2 token = new StringTokenizer2(test, ".");
        while (token.hasMoreTokens()) {
            System.out.println(token.nextToken());
        }
    }

}

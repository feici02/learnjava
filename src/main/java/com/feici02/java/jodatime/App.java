package com.feici02.java.jodatime;

import org.joda.time.LocalTime;

import java.time.Duration;
import java.time.Instant;

public class App {
    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        Instant before = Instant.now();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Instant after = Instant.now();

        Duration duration = Duration.between(before, after);
        System.out.println(duration.toMillis());
    }
}

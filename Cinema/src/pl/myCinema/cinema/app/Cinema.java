package pl.myCinema.cinema.app;

import pl.myCinema.cinema.model.*;

public class Cinema {
    public static void main(String[] args) {
        final String appName = "Cinema v0.1";

        System.out.println(appName);
        Movies movie1 = new Movies("Mask");

        System.out.println(movie1);
    }
}

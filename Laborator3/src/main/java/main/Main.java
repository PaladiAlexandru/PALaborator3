package main;

import locations.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Hotel v1 = new Hotel("Hotel");
        Museum v2 = new Museum("Museum A");
        Museum v3 = new Museum("Museum B");
        Church v4 = new Church("Church A");
        Church v5 = new Church("Church B");
        Restaurant v6 = new Restaurant("Restaurant");
        v1.setTimeRequired(v2,10);
        v1.setTimeRequired(v3,50);
        v2.setTimeRequired(v3,20);
        v2.setTimeRequired(v4,20);
        v2.setTimeRequired(v5,10);
        v3.setTimeRequired(v4,20);
        v3.setTimeRequired(v2,20);
        v4.setTimeRequired(v5,30);
        v4.setTimeRequired(v6,10);
        v5.setTimeRequired(v6,20);
        v5.setTimeRequired(v4,30);

        City city = new City();
        city.addLocation(v1);
        city.addLocation(v2);
        city.addLocation(v3);
        city.addLocation(v4);
        city.addLocation(v5);
        city.addLocation(v6);

        Collections.sort(city.getLocations());
        for(Location location : city.getLocations())
            System.out.println(location.getName());
    }
}

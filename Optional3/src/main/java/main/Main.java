package main;

import locations.*;
import locations.interfaces.Visitable;
import user.TravelPlan;

import java.time.LocalTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Hotel v1 = new Hotel("Hotel");
        Museum v2 = new Museum("Museum A");
        Museum v3 = new Museum("Museum B");
        Church v4 = new Church("Church A");
        Church v5 = new Church("Church B");
        Restaurant v6 = new Restaurant("Restaurant");
        v1.setTimeRequired(v2, 10);
        v1.setTimeRequired(v3, 50);
        v2.setTimeRequired(v3, 20);
        v2.setTimeRequired(v4, 20);
        v2.setTimeRequired(v5, 10);
        v3.setTimeRequired(v4, 20);
        v3.setTimeRequired(v2, 20);
        v4.setTimeRequired(v5, 30);
        v4.setTimeRequired(v6, 10);
        v5.setTimeRequired(v6, 20);
        v5.setTimeRequired(v4, 30);



        v2.setOpeningHours(LocalTime.of(8, 50));
        v3.setOpeningHours(LocalTime.of(8, 10));
        v4.setOpeningHours(LocalTime.of(9, 30));
        v5.setOpeningHours(LocalTime.of(7, 50));
        v2.setClosingHours(LocalTime.of(9,30));

        City city = new City();
        city.addLocation(v1);
        city.addLocation(v2);
        city.addLocation(v3);
        city.addLocation(v4);
        city.addLocation(v5);
        city.addLocation(v6);

        city.visitAndNotPay();
        System.out.println(Visitable.getVisitingDuration(v2));
        List<Location> pref =new ArrayList<>();
        pref.add(v2);
        pref.add(v5);
        TravelPlan travelPlan = new TravelPlan(city,pref);
    }
}

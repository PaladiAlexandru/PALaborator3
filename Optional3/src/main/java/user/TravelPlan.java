package user;

import locations.City;
import locations.Location;

import java.util.List;

public class TravelPlan {
    City city;
    List<Location> preferences;

    public TravelPlan(City city, List<Location> preferences) {
        this.city = city;
        this.preferences = preferences;
    }
}

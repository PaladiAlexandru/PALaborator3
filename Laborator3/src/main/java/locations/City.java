package locations;

import locations.interfaces.Visitable;

import java.util.ArrayList;
import java.util.List;


public class City {
    List<Location> locations;

    public City() {
        this.locations = new ArrayList<>();
    }

    public void addLocation(Location location) {
        this.locations.add(location);
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }


    public List<Location> getLocations() {
        return locations;
    }

}

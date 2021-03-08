package locations;

import locations.interfaces.Payable;
import locations.interfaces.Visitable;

import java.util.ArrayList;
import java.util.Collections;
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

    public void visitAndNotPay(){
        List<Location> visitLocations = new ArrayList<>();
        for(Location location: locations){
            if(location instanceof Visitable && !(location instanceof Payable)){
                visitLocations.add(location);
            }
        }
        Collections.sort(visitLocations,Location::compareByOpeningHours);

        for(Location location:visitLocations){
            System.out.println(location.getName());
        }
    }

    public List<Location> getLocations() {
        return locations;
    }

}

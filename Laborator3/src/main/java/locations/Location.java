package locations;


import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public abstract class Location implements Comparable<Location> {
    private String name;
    private String description;
    private String coordinates;
    private Map<Location,Integer> timeRequired;
    protected LocalTime openingHours;
    protected int fee;
    protected int rank;
    public Location(String name) {
        this.timeRequired = new HashMap<>();
        this.name = name;
    }

    public void setTimeRequired(Location location, int cost) {

        this.timeRequired.put(location,cost);
    }

    public Map<Location, Integer> getTimeRequired() {
        return timeRequired;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Location o) {
        if(this.getName().compareTo(o.getName())==0){
            return 0;
        }else if(this.getName().compareTo(o.getName())<0)
            return -1;
        return 1;
    }
}

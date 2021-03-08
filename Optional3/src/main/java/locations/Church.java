package locations;

import locations.interfaces.Visitable;

import java.time.LocalTime;
import java.util.Map;

public class Church extends Location implements Visitable {

    public Church(String name) {
        super(name);
    }


    @Override
    public LocalTime getOpeningHours() {
        return super.openingHours;
    }

    @Override
    public LocalTime getClosingHours() {
        return this.closingHours;
    }


    public void setOpeningHours(LocalTime localTime) {
        this.openingHours = localTime;
    }

}

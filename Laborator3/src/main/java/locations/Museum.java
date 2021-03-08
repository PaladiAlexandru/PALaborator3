package locations;

import locations.interfaces.Payable;
import locations.interfaces.Visitable;

import java.time.LocalTime;
import java.util.Map;

public class Museum extends Location implements Payable, Visitable {

    public Museum(String name) {
        super(name);

    }
    @Override
    public LocalTime getOpeningHours() {
        return this.openingHours;
    }

    @Override
    public int getEntryFee() {
        return this.fee;
    }
}

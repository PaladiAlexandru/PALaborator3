package locations;

import locations.interfaces.Classifiable;
import locations.interfaces.Payable;

import java.util.Map;

public class Restaurant extends Location implements Classifiable, Payable {
    private int fee;
    private int rank;
    public Restaurant(String name) {
        super(name);
    }


    @Override
    public int getEntryFee() {
        return this.fee;
    }

    @Override
    public int getRank() {
        return this.rank;
    }
}

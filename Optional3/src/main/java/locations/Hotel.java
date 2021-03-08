package locations;

import locations.interfaces.Classifiable;
import locations.interfaces.Payable;



public class Hotel extends Location implements Classifiable, Payable {

    public Hotel(String name) {
        super(name);
    }



    public void setFee(int fee) {
        this.fee = fee;
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

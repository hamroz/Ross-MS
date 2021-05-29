package core.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class InHousePart extends Part {

    private final IntegerProperty machineID;

    public InHousePart(){
        super();
        machineID = new SimpleIntegerProperty();
    }

    public int getMachineID() {
        return this.machineID.get();
    }

}

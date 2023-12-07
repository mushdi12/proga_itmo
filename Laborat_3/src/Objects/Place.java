package Objects;

import Enums.Location;
import Interfaces.Position;

public class Place extends Obj implements Position {

    @Override
    public String toString() {
        return name;
    }

    public Place(String name){
        super(name);
        this.name = name;
    }

    @Override
    public void getCoordinate(Place place){
        super.name = super.name + " в " + place.name;
    }

}
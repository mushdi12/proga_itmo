package Objects;

import Interfaces.Addition;

public class Things extends Obj implements Addition {
    @Override
    public String toString() {
        return name;
    }

    public Things(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void getAddition(String addition) {
        this.name = " " + addition + " " + this.name;
    }

    public void getCoordinate(Place place){
        super.name = super.name + " по " + place;

    }


}
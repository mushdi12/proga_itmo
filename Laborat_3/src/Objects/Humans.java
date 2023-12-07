package Objects;

import Humans.Action;
import Interfaces.Addition;

import java.util.Objects;

public class Humans extends Obj implements Addition {

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Humans humans = (Humans) o;
        return Objects.equals(name.toLowerCase(), humans.name.toLowerCase());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    private String name;

    public Humans(String name) {
        super(name);
        this.name = name;

    }

    public void activity(Action act) {
        if (act == Action.GoWork) {
            System.out.print(super.name + " утроился на");
        } else if (act == Action.MakeMoney) {
            System.out.print(super.name + " заработает");
        } else if (act == Action.Walk) {
            System.out.print(super.name + " шел");
        } else if (act == Action.See) {
            System.out.print(super.name + " увидел");
        } else if (act == Action.appeared) {
            System.out.print(super.name + " появилось");
        } else if (act == Action.enough) {
            System.out.print(super.name + " хватит на ");
        } else if (act == Action.written) {
            System.out.print(super.name + " написано");
        } else if (act == Action.entered) {
            System.out.print(super.name + " вошел");
        } else if (act == Action.appear) {
            System.out.print(super.name + " очутился");
        } else if (act == Action.sitting) {
            System.out.print(super.name + " сидели");
        } else if (act == Action.sit) {
            System.out.print(super.name + " сидел");
        } else if (act == Action.sits) {
            System.out.print(super.name + " сидела");
        } else if (act == Action.talking) {
            System.out.print(super.name + " разговаривал");
        } else if (act == Action.asked) {
            System.out.print(super.name + " спросил");
        } else if (act == Action.employ) {
            System.out.print(super.name + " нанимают");
        } else if (act == Action.said) {
            System.out.print(super.name + " сказал");
        } else if (act == Action.opened) {
            System.out.print(super.name + " отворилась");
            } else if (act == Action.dragged) {
            System.out.print(super.name + " втащил");
        } else if (act == Action.entereds) {
            System.out.print(super.name + " вошла");
        }
    }

    @Override
    public void getAddition(String addition) {
        super.name = this.name;
        super.name = " " + addition + " " + super.name;
    }

    public void activity(Action act, Obj o) {
        activity(act);
        System.out.print(o);
    }

    public void getCoordinate(Place place){
        super.name = super.name + place;

    }
}


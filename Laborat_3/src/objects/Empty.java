package objects;

import enums.Actions;
import interfaces.AdditionBefore;


import java.util.Objects;

public class Empty extends Basic implements  AdditionBefore {

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empty empty = (Empty) o;
        return Objects.equals(name, empty.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    final private String name;

    public Empty(String name) {
        super(name);
        this.name = name;
    }

    public void doSomethingWithAfter(Actions act, Object o) {
        switch (act) {
            case SEE:
                System.out.print(super.name + " увидел" + o);
                break;
            case APPEAR:
                System.out.print(super.name + " очутился в" + o);
                break;
            case TALK:
                System.out.print(super.name + " разговаривал" + o);
                break;
            case SIT:
                System.out.print(super.name + "сидела " + o);
                break;
        }

    }

    @Override
    public void getAdditionBefore(String addition) {
        super.name = this.name;
        super.name = addition + " " + this.name;
    }


}

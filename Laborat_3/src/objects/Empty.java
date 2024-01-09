package objects;

import enums.Actions;
import interfaces.AdditionBefore;


import java.util.Objects;

public class Empty extends Basic implements  AdditionBefore {

    @Override
    public String toString() {
        return name;
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

    public Empty(String name) {
        super(name);
    }

    public void doSomethingWithAfter(Actions act, Object o) {
        switch (act) {
            case SEE -> System.out.print(name + " увидел" + o);
            case APPEAR -> System.out.print(name + " очутился в" + o);
            case TALK -> System.out.print(name + " разговаривал" + o);
            case SIT -> System.out.print(name + "сидела " + o);
        }

    }

    @Override
    public void getAdditionBefore(String addition) {
            name = addition + " " + name;
    }


}

package objects;

import enums.Actions;
import interfaces.Additions;
import interfaces.Adverbs;

import java.util.Objects;

public class Empty extends Basic implements Additions, Adverbs {

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
    public void doSomethingWithBefore(Actions act, Object o) {
        switch (act) {
            case WORK:
                System.out.print(super.name + " утроился на" + o);
                break;
        }
    }


    @Override
    public void getAdditionBefore(String addition) {
        super.name = this.name;
        super.name = addition + " " + this.name;
    }

    @Override
    public void getAdditionAfter(String addition) {
        super.name = this.name;
        super.name = this.name + " " + addition;
    }
    @Override
    public void getAdverbsAfter(String adverbs){
        super.name = this.name;
        super.name = this.name + " " + adverbs;
    }
    @Override
    public void getAdverbsBefore(String adverbs){
        super.name = this.name;
        super.name = adverbs + " " +this.name;
    }


}

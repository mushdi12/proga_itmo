package objects;

import enums.Actions;
import interfaces.Additions;
import interfaces.Adverbs;

import java.util.Objects;

public class Pronoun extends Basic implements Additions, Adverbs {

    @Override
    public String toString() {
        return super.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pronoun entity = (Pronoun) o;
        return Objects.equals(name, entity.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    final private String name;

    public Pronoun(String name) {
        super(name);
        this.name = name;
    }

    public void doSomethingWithBefore(Actions act, Object o) {
        switch (act) {


        }

    }

    public void doSomethingWithAfter(Actions act, Object o) {
        switch (act) {
            case APPEARED:
                System.out.print(super.name + " появилась" + o);
                break;
            case EARN:
                System.out.print(super.name + " заработает" + o);
                break;
            case WALK:
                System.out.print(super.name + " шел по" + o);
                break;
            case ENOUGH:
                System.out.print(super.name + " хватит на" + o);
                break;
            case SEE:
                System.out.print(super.name + " увидел" + o);
                break;
            case APPEAR:
                System.out.print(super.name + " очутился в" + o);
                break;
            case DRAGGED:
                System.out.print(super.name + " втащил " + o);
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
    public void getAdverbsAfter(String adverbs) {
        super.name = this.name;
        super.name = this.name + " " + adverbs;
    }

    @Override
    public void getAdverbsBefore(String adverbs) {
        super.name = this.name;
        super.name = adverbs + " " + this.name;
    }


}

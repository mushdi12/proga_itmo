package objects;

import enums.Actions;
import interfaces.AdditionAfter;
import interfaces.AdditionBefore;

import java.util.Objects;

public class Pronoun extends Basic implements AdditionAfter, AdditionBefore {

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


    public Pronoun(String name) {
        super(name);
    }

    public void doSomethingWithAfter(Actions act, Object o) {
        switch (act) {
            case APPEARED -> System.out.print(name + " появилась" + o);
            case EARN -> System.out.print(name + " заработает" + o);
            case WALK -> System.out.print(name + " шел по" + o);
            case ENOUGH -> System.out.print(name + " хватит на" + o);
            case SEE -> System.out.print(name + " увидел" + o);
            case APPEAR -> System.out.print(name + " очутился в" + o);
            case DRAGGED -> System.out.print(name + " втащил " + o);
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

}

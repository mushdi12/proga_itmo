package objects;

import enums.Actions;
import interfaces.Additions;
import interfaces.Adverbs;

import java.util.Objects;

public class Entity extends Basic implements Additions, Adverbs {

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return Objects.equals(name, entity.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    final private String name;

    public Entity(String name) {
        super(name);
        this.name = name;
    }

    public void doSomethingWithAfter(Actions act, Object o) {
        switch (act) {
            case WORK:
                System.out.print(super.name + " утроился на" + o);
                break;
            case COME:
                System.out.print(super.name + " вошел в" + o);
                break;
            case SITS:
                System.out.print(super.name + " сидели на" + o);
                break;
            case ASK:
                System.out.print(super.name + " спросил " + o);
                break;
            case COMES:
                System.out.print(super.name + " вошла в" + o);
                break;


        }

    }

    public void doSomethingAfter(Actions act) {
        switch (act) {
            case SIT:
                System.out.print(super.name + " сидел ");
                break;
            case ANSWER:
                System.out.print(super.name + " ответил");
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

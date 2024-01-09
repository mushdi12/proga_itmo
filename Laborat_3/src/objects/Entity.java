package objects;

import enums.Actions;
import exception.Checked;
import exception.Unchecked;
import interfaces.AdditionBefore;


import java.util.Objects;

public class Entity extends Basic implements AdditionBefore {
    @Override
    public String toString() {
        return name;
    }
    public Entity(String name) {
        super(name);
        try {
            cheekNullSecond(name);
            this.name = "a";
        }
        catch (Checked a){
            System.out.println(a.getMessage());
        }
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



    public void doSomethingWithAfter(Actions act, Object o) {
        try {
            cheekNull(o);
            switch (act) {
                case WORK -> System.out.print(name + " устроился на" + o);
                case COME -> System.out.print(name + " вошел в" + o);
                case SITS -> System.out.print(name + " сидели на" + o);
                case ASK -> System.out.print(name + " спросил " + o);
                case COMES -> System.out.print(name + " вошла в" + o);
            }
        }
        catch (Unchecked a){
            System.out.println(a.getMessage());
        }

    }

    public void doSomethingAfter(Actions act) {
        switch (act) {
            case SIT -> System.out.print(name + " сидел ");
            case ANSWER -> System.out.print(name + " ответил");
        }
    }


    @Override
    public void getAdditionBefore(String addition) {
        name = addition + " " + name;
    }
    public void cheekNull(Object a){
        if (a == null)
            throw new Unchecked("!!! TREVOGA !!!");
    }
    public void cheekNullSecond(Object a) throws Checked{
        if (a == null)
            throw new Checked("!!! trevoga !!!");
    }
}

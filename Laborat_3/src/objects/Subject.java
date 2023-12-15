package objects;

import enums.Actions;
import interfaces.AdditionAfter;
import interfaces.AdditionBefore;

import java.util.Objects;

public class Subject extends Basic implements AdditionAfter, AdditionBefore {

    @Override
    public String
    toString() {
        return super.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return Objects.equals(name, subject.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    final private String name;

    public Subject(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void getAdditionBefore(String addition) {
        super.name = this.name;
        super.name = " " + addition + " " + this.name;
    }

    @Override
    public void getAdditionAfter(String addition) {
        super.name = this.name;
        super.name = " " + this.name + " " + addition;
    }


    public void doSomethingAfter(Actions act) {
        switch (act) {
            case BOUGHT:
                System.out.print(super.name + " отворилась");
                break;

        }
    }
}

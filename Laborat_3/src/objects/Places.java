package objects;

import interfaces.AdditionAfter;
import interfaces.AdditionBefore;

import java.util.Objects;

public class Places extends Basic implements AdditionAfter, AdditionBefore {

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Places subject = (Places) o;
        return Objects.equals(name, subject.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


    public Places(String name) {
        super(name);
    }

    @Override
    public void getAdditionBefore(String addition) {
        name = " " + addition + " " + name;
    }

    @Override
    public void getAdditionAfter(String addition) {
        name = " " + name + " " + addition;
    }

}

package objects;

import enums.Actions;
import interfaces.Additions;

import java.util.Objects;

public class Places extends Basic implements Additions {

    @Override
    public String
    toString() {
        return super.name;
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

    final private String name;

    public Places(String name) {
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

}

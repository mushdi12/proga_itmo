import enums.Actions;
import objects.*;

public class Main {
    public static void main(String[] args) {
        // живые сущности
        Entity dunno = new Entity("Незнайка");
        Entity lows = new Entity("коротышек");
        Entity employee = new Entity("сотрудник");
        Entity shorties = new Entity("коротышку");
        Entity shorty = new Entity("Коротышка");
        Entity poodle = new Entity("пудель");
        Entity hostess = new Entity("хозяйку");
        Entity maid = new Entity("служанка");
        Entity dog = new Entity("собачонка");

        // местоимение
        Pronoun him = new Pronoun("него");
        Pronoun he = new Pronoun("он");
        Pronoun which_one = new Pronoun("которой");

        // пустые
        Empty empty = new Empty("");

        // неживые объекты и понятия
        Subject work = new Subject("работу");
        Subject hope = new Subject(" надежда");
        Subject money = new Subject("сумму денег");
        Subject payment = new Subject("оплату");
        Subject title = new Subject("надпись");
        Subject phone = new Subject("телефону");
        Subject door_subject = new Subject("дверь");

        // места
        Places street = new Places(" улице");
        Places door = new Places(" дверь");
        Places room = new Places(" комнате");
        Places office = new Places(" контору");
        Places bench = new Places("лавочке");

        System.out.print("======================================================================\n");
        //- 1 предложение
        dunno.getAdditionBefore("Вскоре");
        work.getAdditionBefore("постоянную");
        dunno.doSomethingWithAfter(Actions.WORK, work);
        System.out.print(", и у ");
        him.doSomethingWithAfter(Actions.APPEARED, hope);
        System.out.print(",что ");
        money.getAdditionBefore("такую");
        he.doSomethingWithAfter(Actions.EARN, money);
        System.out.print(", ");
        payment.getAdditionAfter("лечения");
        which_one.doSomethingWithAfter(Actions.ENOUGH, payment);
        System.out.print(". ");

        //- 2 предложение
        he.getAdditionBefore("Однажды");
        he.doSomethingWithAfter(Actions.WALK, street);
        System.out.print(", и");
        title.getAdditionAfter(": \"Контора по найму собачьих нянь\"");
        empty.doSomethingWithAfter(Actions.SEE, title);
        System.out.println(".");

        //- 3 предложение
        dunno.getAdditionBefore("Набравшись смелости,");
        dunno.doSomethingWithAfter(Actions.COME, door);
        System.out.print(" и");
        empty.doSomethingWithAfter(Actions.APPEAR, room);
        System.out.print(", где ");
        lows.getAdditionBefore("несколько");
        bench.getAdditionBefore("длинной");
        lows.doSomethingWithAfter(Actions.SITS, bench);
        System.out.print(". ");

        //- 4 предложение
        employee.getAdditionBefore("В конце комнаты");
        employee.doSomethingAfter(Actions.SIT);
        System.out.print("и");
        phone.getAdditionBefore("с кем-то по");
        empty.doSomethingWithAfter(Actions.TALK, phone);
        System.out.print(". ");

        //- 5 предложение
        dunno.getAdditionBefore("Присев на краю лавочки,");
        dunno.doSomethingWithAfter(Actions.ASK, shorties);
        System.out.println(" :");
        System.out.print("Кто такие собачьи няни и для чего их нанимают? ");

        //- 6 предложение
        shorty.doSomethingAfter(Actions.ANSWER);
        System.out.print(": ");
        door_subject.getAdditionBefore("Как раз в это время");
        door_subject.doSomethingAfter(Actions.BOUGHT);
        System.out.print(",и ");
        poodle.getAdditionBefore("большой белый");
        poodle.doSomethingWithAfter(Actions.COME,office);
        System.out.println(". ");

        //- 7 предложение
        System.out.print("И ");
        he.getAdditionAfter("за собой на цепочке");
        he.doSomethingWithAfter(Actions.DRAGGED,hostess);
        System.out.print(" в пышном газовом платье и большой модной шляпе, напоминавшей корзину с цветами. ");

        //- 8 предложение
        maid.getAdditionBefore("Вслед за хозяйкой");
        maid.doSomethingWithAfter(Actions.COMES,office);
        empty.getAdditionBefore(", на руках у которой");
        empty.doSomethingWithAfter(Actions.SIT, dog);
        System.out.println(" с головы до хвоста покрытая рыженькими кудряшками. ");

        //проверка на одного и того же человека с ЧЕРЕЗ РЕГИСТР
        Entity e1 = new Entity("Name1");
        Entity e2 = new Entity("Name1");

        System.out.println(e1.equals(e2));
        System.out.print("======================================================================\n");





    }
}








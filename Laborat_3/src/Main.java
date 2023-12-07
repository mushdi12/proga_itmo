import Enums.Location;
import Humans.Action;
import Objects.Humans;
import Objects.Place;
import Objects.Things;

import javax.xml.crypto.dom.DOMCryptoContext;

public class Main {
    public static void main(String[] args) {
        // живые сущности
        Humans Dunno = new Humans("Незнайка");
        Humans him = new Humans("него");
        Humans her = new Humans("неё");
        Humans he = new Humans("он");
        Humans his = new Humans(" ему");
        Humans He = new Humans("Oн");
        Humans whichOne = new Humans("которой");
        Humans The_poodle = new Humans("Белый Пудель");
        Humans shorties = new Humans("коротышек");
        Humans employee = new Humans("Cотрудник");
        Humans shor = new Humans(" коротышку");
        Humans shorty = new Humans("Kоротышка");
        Humans the_Maid = new Humans("Cлужанка");
        Humans invisible = new Humans("");

        // неживые сущности
        Things the_dody = new Things("собачонка");
        Things work = new Things("работу");
        Things possibility = new Things(" надежда");
        Things cash = new Things("сумму");
        Things treatment = new Things("оплату");
        Things signboard = new Things(" вывеску");
        Things boldness = new Things("смелости");
        Things phone = new Things(" по телефону");
        Things room = new Things(" в комнатe");
        Things lv = new Things("лавочке");
        Things door_thing = new Things(" в дверь");
        Things The_hat = new Things("шляпе");
        Things shopping_cart = new Things("корзину");
        Things po = new Things("по ");
        Things the_Hostess = new Things("хозяйку");


        //  места
        Place street = new Place(" по улице");
        Place room_1 = new Place(" в комнате");




        // --1--
        work.getAddition("постоянную");
        cash.getAddition("такую");
        Dunno.activity(Action.GoWork, work);
        System.out.print(",и у ");
        him.activity(Action.appeared,possibility);
        System.out.print(",что ");
        he.activity(Action.MakeMoney,cash);
        System.out.print(", ");
        whichOne.activity(Action.enough,treatment);
        System.out.print(" лечения. ");

        // --2--
        Dunno.getCoordinate(street);
        Dunno.activity(Action.Walk);
        System.out.print(" и");
        invisible.activity(Action.See,signboard);
        System.out.print(", на ");
        whichOne.activity(Action.written);
        System.out.println(" \"Контора по найму собачьих нянь\". ");

        // --3--
        He.activity(Action.entered,door_thing);
        System.out.print(" и");
        invisible.activity(Action.appear,room);
        System.out.print(", где");
        shorties.getAddition("несколько");
        lv.getAddition("на длинной");
        shorties.activity(Action.sitting,lv);
        System.out.print(". ");

        // --4--
        employee.getCoordinate(room_1);
        employee.activity(Action.sit);
        System.out.print(" и");
        invisible.activity(Action.talking,phone);
        System.out.print(". ");

        // --5--
        Dunno.activity(Action.asked,shor);
        System.out.println(", - кто такие собачьи няни и для чего их нанимают?");

        // --6--
        shorty.activity(Action.said,his);
        System.out.print(": в это время дверь");
        invisible.activity(Action.opened);
        System.out.print(", ");
        The_poodle.activity(Action.entered);
        System.out.print(". ");

        // --7--
        the_Hostess.getAddition("на цепочке");
        He.activity(Action.dragged,the_Hostess);
        System.out.print(". ");

        // --8--
        the_Maid.activity(Action.entereds);
        the_dody.getAddition(" курносая");
        System.out.print(", на руках у ");
        her.activity(Action.sits,the_dody);
        System.out.print(". ");



















    }
}


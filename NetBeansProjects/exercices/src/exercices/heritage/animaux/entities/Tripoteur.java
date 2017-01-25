package exercices.heritage.animaux.entities;

import exercices.heritage.Tripotable;

/**
 *
 * @author browne
 */
public class Tripoteur {

    public void tripote(Tripotable a) {
        System.out.println(this.getClass().getSimpleName() + " "
                + this.getClass().getDeclaredMethods()[0].getName() + " "
                + a.getClass().getSimpleName());
        if (a instanceof Animal) {
            ((Animal) a).emettreSon();
            System.out.println(this.getClass().getSimpleName() + " Force " + a.getClass().getSimpleName());
            ((Animal) a).son = " hurle";
        }

    }

}

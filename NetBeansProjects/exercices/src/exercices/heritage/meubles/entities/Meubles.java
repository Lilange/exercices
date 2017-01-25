package exercices.heritage.meubles.entities;

import exercices.heritage.Tripotable;

/**
 *
 * @author browne
 */
public abstract class Meubles implements Tripotable {

    public String nom = "";

    public void getType() {
        System.out.println("Le type de meuble est : " + nom + this.getClass().getSimpleName());
    }

}

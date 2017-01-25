package exercices.heritage.animaux.entities;

import exercices.heritage.Tripotable;

public abstract class Animal implements Tripotable {

    public String son = "";

    public void emettreSon()    

    {
        System.out.println("Le " + this.getClass().getSimpleName() + " " + son);

    }

}

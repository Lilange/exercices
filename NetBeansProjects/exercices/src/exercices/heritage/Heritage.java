
package exercices.heritage;

import exercices.core.Application;
import exercices.heritage.animaux.entities.Animal;
import exercices.heritage.animaux.entities.Tripoteur;
import exercices.heritage.animaux.entities.impl.Chat;
import exercices.heritage.animaux.entities.impl.Chien;
import exercices.heritage.meubles.entities.Meubles;
import exercices.heritage.meubles.entities.impl.Table;

/**
 *
 * @author browne
 */
public class Heritage extends Application {

    @Override
    public void start() {
        Animal chat = new Chat();
        Animal chien = new Chien();
        Meubles table = new Table();
        Tripoteur Loic = new Tripoteur();
        
        Loic.tripote(table);
        Loic.tripote(chien);
        chien.emettreSon();
        chat.emettreSon();

       
                
    }

    @Override
    public void create() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

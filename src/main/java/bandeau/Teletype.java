/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

/**
 *
 * @author plafaye
 */
public class Teletype extends Effets {
    
    public Bandeau bandeau;

    public Teletype(Bandeau bandeau) {
        this.bandeau = bandeau;
    }

    @Override
    public void executeEffet() {
      String message =  bandeau.getMessage();
      int nbLettres = message.length();
      for(int i=0; i<=nbLettres; i++){
          bandeau.setMessage(message.substring(0, i));
          bandeau.sleep(500);
      }
    }
}
    

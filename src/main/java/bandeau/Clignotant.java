/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.awt.Color;

/**
 *
 * @author plafaye
 */
public class Clignotant extends Effets{
    
    public Bandeau bandeau;
    
	public void executeEffet()
	{
            Color couleur= bandeau.getForeground();
            
            for(int i=1; i<=10; i++){
		bandeau.setForeground(bandeau.getBackground());
                bandeau.sleep(500);
                bandeau.setForeground(couleur);
                bandeau.sleep(500);
            }
            }

    public Clignotant(Bandeau bandeau) {
        this.bandeau = bandeau;
    }
            }
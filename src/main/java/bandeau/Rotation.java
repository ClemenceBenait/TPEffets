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
public class Rotation extends Effets
{
     public Bandeau bandeau;
     
      public Rotation(Bandeau bandeau) {
        this.bandeau = bandeau;
    }
     
	public void executeEffet()
	{
            for(float i=0; i<=Math.PI*2; i+=0.1){             
		bandeau.setRotation(i);
                bandeau.sleep(10);
               }
            bandeau.setRotation(0.0);
}}

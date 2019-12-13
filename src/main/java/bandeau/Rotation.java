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
     
	public void executeEffet()
	{
            for(int i=1; i<=18; i++){
		bandeau.setRotation(10);
                bandeau.sleep(10);
	}
}

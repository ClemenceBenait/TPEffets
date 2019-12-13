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
public class Clignotant extends Effets{
    
    public Bandeau bandeau;
    
	public void executeEffet()
	{
            for(int i=1; i<=10; i++){
		bandeau.setForeground(bandeau.getBackground());
                bandeau.sleep(1000);
                bandeau.setBackground(bandeau.getForeground());
                bandeau.sleep(1000);
            }
            }
            }
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;
import java.awt.Font;


/**
 *
 * @author plafaye
 */
public class Zoom extends Effets{
    
    public Bandeau bandeau;

    public Zoom(Bandeau bandeau) {
        this.bandeau = bandeau;
    }
    
    public void executeEffet()
	{
            for(int i=1; i<=100; i++){
                int size=bandeau.getFont().getSize();
               Font f = new Font(null, Font.BOLD, size+i);

            bandeau.setFont(f);
            
            bandeau.sleep(10);
            }
        }
}

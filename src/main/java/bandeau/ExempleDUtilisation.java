package bandeau;

import java.awt.Color;
import java.awt.Font;

public class ExempleDUtilisation {
    private final Bandeau monBandeau = new Bandeau();
    
    public static void main(String[] args) {
	    new ExempleDUtilisation().exemple();
    }
    
    public void exemple() {
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();

        monBandeau.setMessage("M. Faucher le best");

		Scenario s2 = new Scenario(monBandeau);
		s2.addEffets(new JeuDuPendu(monBandeau),1);
		s2.executeScenario();


        Scenario s1 =new Scenario(monBandeau);    
        s1.addEffets(new Rotation(monBandeau),2);
        s1.addEffets(new Clignotant(monBandeau),1);
        s1.addEffets(new Teletype(monBandeau),1);
        s1.addEffets(new Zoom(monBandeau),1);
        s1.executeScenario();
        
        /*
	monBandeau.sleep(1000);
	monBandeau.setMessage("On va changer de police");
	monBandeau.sleep(1000);
	monBandeau.setMessage("Monospaced 15 Bold");
	monBandeau.setFont(new Font("Monospaced", Font.BOLD, 15));
	monBandeau.sleep(1000);
	monBandeau.setMessage("SansSerif 15");
	monBandeau.setFont(new Font("SansSerif", Font.PLAIN, 15));
	monBandeau.sleep(1000);
	monBandeau.setMessage("On va zoomer");
	monBandeau.sleep(1000);
	monBandeau.setMessage("Zoom........");
	for (int i = 5; i < 60 ; i+=5) {
		monBandeau.setFont(new Font("Dialog", Font.BOLD, 5+i));
		monBandeau.sleep(100);
	}
	monBandeau.sleep(1000);

	monBandeau.setFont(new Font("Courier new", Font.PLAIN, 15));
	monBandeau.setMessage("On va tourner");
	monBandeau.sleep(1000);
	monBandeau.setMessage("On tourne...");
	for (int i = 0; i <= 100; i++) {
		monBandeau.setRotation(2*Math.PI*i / 100);
		monBandeau.sleep(100);
	}

	monBandeau.setMessage("On va changer de couleur de fond");
	monBandeau.sleep(1000);
	monBandeau.setBackground(Color.DARK_GRAY);
	monBandeau.setMessage("On va changer de couleur");
	monBandeau.sleep(1000);
	monBandeau.setForeground(Color.YELLOW);
	monBandeau.sleep(1000);
	monBandeau.setFont(font);
	monBandeau.setForeground(fore);
	monBandeau.setBackground(back);
	monBandeau.setMessage("Termine");
    */

   }


}

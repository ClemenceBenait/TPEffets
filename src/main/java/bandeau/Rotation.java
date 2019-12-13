package bandeau;

import java.util.Random;

/**
 *
 * @author plafaye
 */
public class Rotation extends Effets{
     public Bandeau bandeau;
     
     public Rotation(Bandeau bandeau) {
     	this.bandeau = bandeau;
     }
     
	public void executeEffet(){
		Random r = new Random();
		executeEffectAvecSens(r.nextBoolean());
		bandeau.setRotation(0.0);
	}

	public void executeEffectAvecSens(boolean sens){
     	if (sens){
			for (float i = 0; i <= Math.PI * 2; i += 0.1) {
				bandeau.setRotation(i);
				bandeau.sleep(100);
			}
		}else {
			for (float i = 0; i <= Math.PI * 2; i += 0.1) {
				bandeau.setRotation(-i);
				bandeau.sleep(100);
			}
		}
	}
}
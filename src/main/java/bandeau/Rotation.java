package bandeau;

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
		/*
		for(float i=0; i<=Math.PI*2; i+=0.1){
			bandeau.setRotation(i);
			bandeau.sleep(10);
		}

		*/
		executeEffectAvecSens(true);
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
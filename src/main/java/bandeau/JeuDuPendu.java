package bandeau;

import java.util.*;

public class JeuDuPendu extends Effets {

    public Bandeau bandeau;

    public JeuDuPendu(Bandeau bandeau) {
        this.bandeau = bandeau;
    }

    @Override
    public void executeEffet() {
        String message = bandeau.getMessage();
        StringBuilder messageAffiche = new StringBuilder();
        int longueurMessage = message.length();
        List <Integer> mot = new LinkedList<>();

        for(int i = 0; i < longueurMessage; i++){
            messageAffiche.append("_");
            bandeau.setMessage(messageAffiche.toString());
            bandeau.sleep(100);
        }

        List<Integer> tableau = new ArrayList<>();
        for (int i = 0; i < longueurMessage; i++){tableau.add(i);}
        Collections.shuffle(tableau);
        for (Integer a : tableau) {
            StringBuilder st = new StringBuilder(message);
            char m = st.charAt(a);
            StringBuilder coucou = new StringBuilder(bandeau.getMessage());
            messageAffiche.setCharAt(a,(m));
            bandeau.setMessage(messageAffiche.toString());
            bandeau.sleep(100);
        }



    }

}

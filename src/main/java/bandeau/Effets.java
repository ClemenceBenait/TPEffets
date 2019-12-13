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
public abstract class Effets
{
	private Scenario nom;
        public int nbRepetition;

    public void setNbRepetition(int nbRepetition) {
        this.nbRepetition = nbRepetition;
    }        
	
   public abstract void executeEffet();
	
}
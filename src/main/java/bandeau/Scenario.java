/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandeau;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author plafaye
 */
public class Scenario
{
	private Bandeau bandeau;

    public Scenario(Bandeau bandeau) {
        this.bandeau = bandeau;
    }
	
	private List<Effets> listEffets = new LinkedList<>();
	
	public void addEffets( Effets e)
	{
		listEffets.add(e);
                
	}
	
	public void executeScenario( )
	{
		for(Effets e:listEffets){
                    e.executeEffet();
                }
	}
		
}

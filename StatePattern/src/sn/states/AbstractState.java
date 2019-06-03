package sn.states;

import sn.context.Ventilateur;

public abstract class AbstractState {

	public Ventilateur ventilateur = new Ventilateur();

	
	public abstract void handle();
	
	public abstract void changeState();

	public Ventilateur getVentilateur() {
		return ventilateur;
	}
	
}

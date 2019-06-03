package sn.states;

public class On extends AbstractState {

	public On() {
		super();
	}
	
	@Override
	public void handle() {
		super.ventilateur.setVitesse(10);
		changeState();
	}

	@Override
	public void changeState() {
		super.ventilateur.setState("ON");
	}

}

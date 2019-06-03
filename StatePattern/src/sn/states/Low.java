package sn.states;

public class Low extends AbstractState {

	public Low() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void handle() {
		super.ventilateur.setVitesse(20);
		changeState();
	}

	@Override
	public void changeState() {
		super.ventilateur.setState("LOW");
	}


}

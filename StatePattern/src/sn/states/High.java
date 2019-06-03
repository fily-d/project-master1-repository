package sn.states;

public class High extends AbstractState {

	public High() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void handle() {
		super.ventilateur.setVitesse(30);
		changeState();
	}

	@Override
	public void changeState() {
		super.ventilateur.setState("HIGH");
	}

}

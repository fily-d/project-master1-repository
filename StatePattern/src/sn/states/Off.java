package sn.states;


public class Off extends AbstractState {

	
	public Off() {
		super();
	}

	@Override
	public void handle() {
		super.getVentilateur().setVitesse(0);
		changeState();
	}

	@Override
	public void changeState() {
		super.getVentilateur().setState("OFF");
		
	}


}

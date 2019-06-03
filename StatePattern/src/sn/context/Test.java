package sn.context;

import sn.states.AbstractState;
import sn.states.High;
import sn.states.Low;
import sn.states.Off;
import sn.states.On;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractState off = new Off();
		off.handle();
		off.getVentilateur().affiche();

		System.out.println("************************************************");
		
		AbstractState on = new On();
		on.handle();
		on.getVentilateur().affiche();
		
		System.out.println("************************************************");
		
		AbstractState low = new Low();
		low.handle();
		low.getVentilateur().affiche();
		
		System.out.println("************************************************");
		
		AbstractState high = new High();
		high.handle();
		high.getVentilateur().affiche();
	}

}

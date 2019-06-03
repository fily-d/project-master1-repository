package sn.ut.cli;

import sn.ut.factory.AbstractFactory;
import sn.ut.prod.AbstractOriental;
import sn.ut.prod.AbstractReine;
import sn.ut.prod.AbstractTroisFromage;

public class Client implements AbstractFactory, AbstractOriental, AbstractReine, AbstractTroisFromage {

	@Override
	public void service() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AbstractFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AbstractOriental createOriental(String pays) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AbstractTroisFromage createTroisFromage(String pays) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AbstractReine createReine(String pays) {
		// TODO Auto-generated method stub
		return null;
	}

}

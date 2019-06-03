package sn.ut.factory;

import sn.ut.prod.AbstractOriental;
import sn.ut.prod.AbstractReine;
import sn.ut.prod.AbstractTroisFromage;
import sn.ut.prod.OrientalFR;
import sn.ut.prod.OrientalSN;
import sn.ut.prod.OrientalUSA;

public class OrientalFactory implements AbstractFactory {

	@Override
	public AbstractFactory getFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AbstractOriental createOriental(String pays) {
		if (pays.equalsIgnoreCase("sn")) {
			return new OrientalSN();
		} else if (pays.equalsIgnoreCase("usa")) {
			return new OrientalUSA();
		} else {
			return new OrientalFR();
		}
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

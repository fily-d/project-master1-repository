package sn.ut.factory;

import sn.ut.prod.AbstractOriental;
import sn.ut.prod.AbstractReine;
import sn.ut.prod.AbstractTroisFromage;
import sn.ut.prod.ReineFR;
import sn.ut.prod.ReineSN;
import sn.ut.prod.ReineUSA;

public class ReineFactory implements AbstractFactory {

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
		if (pays.equalsIgnoreCase("sn")) {
			return new ReineSN();
		} else if (pays.equalsIgnoreCase("usa")) {
			return new ReineUSA();
		} else {
			return new ReineFR();
		}
	}

}

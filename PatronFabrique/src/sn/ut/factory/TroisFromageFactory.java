package sn.ut.factory;

import sn.ut.prod.AbstractOriental;
import sn.ut.prod.AbstractReine;
import sn.ut.prod.AbstractTroisFromage;
import sn.ut.prod.TroisFromageFR;
import sn.ut.prod.TroisFromageSN;
import sn.ut.prod.TroisFromageUSA;

public class TroisFromageFactory implements AbstractFactory {

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
		if (pays.equalsIgnoreCase("sn")) {
			return new TroisFromageSN();
		} else if (pays.equalsIgnoreCase("usa")) {
			return new TroisFromageUSA();
		} else {
			return new TroisFromageFR();
		}
	}

	@Override
	public AbstractReine createReine(String pays) {
		// TODO Auto-generated method stub
		return null;
	}

}

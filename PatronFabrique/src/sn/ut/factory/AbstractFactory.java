package sn.ut.factory;

import sn.ut.prod.AbstractOriental;
import sn.ut.prod.AbstractReine;
import sn.ut.prod.AbstractTroisFromage;

public interface AbstractFactory {

	
	public AbstractFactory getFactory();
	
	public AbstractOriental createOriental(String pays);
	
	public AbstractTroisFromage createTroisFromage(String pays);
	
	public AbstractReine createReine(String pays);
}

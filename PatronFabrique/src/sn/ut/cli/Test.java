package sn.ut.cli;

import sn.ut.factory.OrientalFactory;
import sn.ut.factory.ReineFactory;
import sn.ut.factory.TroisFromageFactory;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("===========================ORIENTAL===================================");
		
		OrientalFactory ofac = new OrientalFactory();
		ofac.createOriental("sn").service();
		ofac.createOriental("fr").service();
		ofac.createOriental("usa").service();
		
		System.out.println("============================TROIS-FROMAGE=============================");
		
		TroisFromageFactory tfac = new TroisFromageFactory();
		tfac.createTroisFromage("sn").service();
		tfac.createTroisFromage("fr").service();
		tfac.createTroisFromage("usa").service();
		
		System.out.println("=============================REINE====================================");
		
		ReineFactory rfac = new ReineFactory();
		rfac.createReine("sn").service();
		rfac.createReine("fr").service();
		rfac.createReine("usa").service();
	}

}

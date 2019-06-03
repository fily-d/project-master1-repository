package sn.ut.sing;

public class Singleton {

	private static Singleton instance = new Singleton();
	
	private Singleton() {
		
	}
	
	public static synchronized Singleton getInstance() {
		if(instance == null)
		   return new Singleton();
		else
		   return instance;
	}
	
	public void service() {
		System.out.println("Je suis un singleton");
	}
	
}

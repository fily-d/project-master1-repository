package sn.ut.sing;

public class Client {

	private Singleton sing1 = Singleton.getInstance();
	private Singleton sing2 = Singleton.getInstance();
	private Singleton sing3 = Singleton.getInstance();
	
	public Client() {
		
	}
	
	public void affiche() {
		System.out.println("Je suis un client de : " +(sing1 == sing2));
	}
	
}

package sn.context;


public class Ventilateur {

	private String state;
	private int vitesse;
	
	public Ventilateur() {
		// TODO Auto-generated constructor stub
	}

	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public int getVitesse() {
		return vitesse;
	}

	public void setVitesse(int vitesse) {
		this.vitesse = vitesse;
	}
	
	public void affiche() {
		System.out.println("Etat    : " + this.state );
		System.out.println("Vitesse : " + this.vitesse);
	}

}

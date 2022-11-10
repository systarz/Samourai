
public class Humain {
	private nom;
	private argent;
	private boisson;
	
	public Humain(String nom, int argent, String boisson) {
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;
	}
	
	public void parler(String texte){
		System.out.println(this.nom + " - " + texte);
	}
	
	public void direBonjour(){
		this.parler("Bonjour ! " + "Je m'appelle " + this.nom + " et j'aime boire du " + this.boisson + ".");
	}
	public void boire() {
		this.parler("Mmm, un bon verre de " + this.boisson + " ! GLOUPS !");
	}
	
	private int getArgent() {
		return this.argent;

	}
	
	private String getBoisson() {
		return this.boisson;

	}
	private String getNom() {
		return this.nom;
	}
	
	private void gagnerArgent(int n) {
		this.argent+=n; 
	}
	private void perdreArgent(int n) {
		this.argent-=n;
	}
}



public class Humain {
	public Humain(String nom, int argent, String boisson) {
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;
	}
	public void parler(String texte){
		this.nom + " - " + texte;
	}
	public void direBonjour(){
		this.parler("Bonjour ! " + "Je m'appelle " + this.nom + " et j'aime boire du " + this.boisson + ".");
	}
	public void boire() {
		this.parler("Mmm, un bon verre de " + this.boisson + " ! GLOUPS !");
	}
}

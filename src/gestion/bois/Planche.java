package gestion.bois;

public class Planche extends Dimension {

	private float prix;
	
	public Planche(int id, int longueur, int largeur, int prix) {
		super(id, longueur, largeur);
		this.prix = prix;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Planche) {
			Planche p = (Planche) o;
			if(p.id == this.id)
				return true;
			else
				return false;
		}
		return true;
	}
	
}

import utils.Dimension;
import utils.HorsEspaceJeuException;
import utils.MissileException;
import utils.Position;

public class Vaisseau extends Sprite {

	

	public Vaisseau(Dimension dimension, Position positionOrigine, int vitesse) {
	    super(dimension, positionOrigine, vitesse);
    }
	

    public boolean occupeLaPosition(int x, int y) {
	    return estAbscisseCouverte(x) && estOrdonneeCouverte(y);
    }

    private boolean estOrdonneeCouverte(int y) {
	   return (ordonneeLaPlusBasse() <= y) && (y <= ordonneeLaPlusHaute());
    }

    private boolean estAbscisseCouverte(int x) {
	   return (abscisseLaPlusAGauche() <= x) && (x <= abscisseLaPlusADroite());
    }

    private int ordonneeLaPlusBasse() {
	    return this.origine.ordonnee() - this.dimension.hauteur() + 1;
    }

    int ordonneeLaPlusHaute() {
	   return this.origine.ordonnee();
   }

   public int abscisseLaPlusADroite() {
	   return this.origine.abscisse() + this.dimension.longueur() - 1;
   }

   public int abscisseLaPlusAGauche() {
	   return this.origine.abscisse();
   }

   public void seDeplacerVersLaDroite() {
	   this.origine.changerAbscisse(this.origine.abscisse() + vitesse);
   }

   public void seDeplacerVersLaGauche() {
	   this.origine.changerAbscisse(this.origine.abscisse() - vitesse);
   }

   public void positionner(int x, int y) {
	   this.origine.changerAbscisse(x);
	   this.origine.changerOrdonnee(y);
   }
   
   public Missile tirerUnMissile(Dimension dimensionMissile, int vitesseMissile) {
		
	   throw new MissileException("La longueur du missile est supérieure à celle du vaisseau");
		Position positionOrigineMissile = calculerLaPositionDuTirMissile(dimensionMissile);
		return new Missile(dimensionMissile, positionOrigineMissile, vitesseMissile);
	}


public Position calculerLaPositionDuTirMissile(Dimension dimensionMissile) {
	int abscisseMilieuVaisseau = this.abscisseLaPlusAGauche() + (this.longueur / 2);
	int abscisseOrigineMissile = abscisseMilieuVaisseau - (dimensionMissile.longueur() / 2);

	int ordonneeeOrigineMissile = this.ordonneeLaPlusBasse() - 1;
	Position positionOrigineMissile = new Position(abscisseOrigineMissile, ordonneeeOrigineMissile);
	return positionOrigineMissile;
}
  

}
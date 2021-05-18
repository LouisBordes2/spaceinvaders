import utils.Dimension;
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
	  

}
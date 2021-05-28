package fr.unilim.iut.spaceinvaders;

import utils.Dimension;
import utils.Position;

public abstract class Sprite {

	protected Dimension dimension;
	protected Position origine;
	protected int vitesse;

	public Sprite(Dimension dimension, Position origine, int vitesse) {
		super();
		this.dimension = dimension;
		this.origine = origine;
		this.vitesse = vitesse;
	}

}
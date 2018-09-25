package me.allan.ressources;

import javafx.scene.Parent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Pion extends Parent
{

	private Color couleur;
	private float rayon;
	private Circle cercle;
	
	public Pion(Color couleur, float rayon)
	{
		this.couleur = couleur;
		this.rayon = rayon;
		cercle = new Circle(this.rayon);
		cercle.setFill(this.couleur);
		
		cercle.setLayoutX(500.0);
		cercle.setLayoutY(500.0);
		
		this.getChildren().add(this.cercle);
	}
	
	public void changeColor(Color color)
	{
		this.cercle.setFill(color);
		//refresh le cercle ???
	}
}

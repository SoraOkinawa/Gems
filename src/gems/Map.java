package gems;

import javax.vecmath.Color3f;
import javax.vecmath.Vector3d;
import javax.vecmath.Vector3f;

import simbad.sim.Arch;
import simbad.sim.BallAgent;
import simbad.sim.Box;
import simbad.sim.EnvironmentDescription;
import simbad.sim.Wall;

public class Map extends EnvironmentDescription{
	public Map() {
		//Couleurs
		Color3f rouge = new Color3f(1f, 0f, 0f);
		Color3f jaune = new Color3f(1f, 1f, 0f);
		
		//J1
		Joueur j1 = new Joueur(new Vector3d(-7, 0, 2),"J1");
		add(j1);
		
		//J2
		Joueur j2 = new Joueur(new Vector3d(5, 0, 0), "J2");
		add(j2);
		
		//Balle
		Color3f c = new Color3f(0.6f, 0.0f, 0.0f);
		BallAgent balle = new BallAgent(new Vector3d(-8, 0, 2), "balle", c, 0.25f, 0.25f);
		add(balle);
		setUsePhysics(true);
		
		//Mur Droit
		Wall murDroit = new Wall(new Vector3d(10, 0, 0), 11, 1, this);
		murDroit.rotate90(1);
		add(murDroit);
		
		//Mur Gauche
		Wall murGauche = new Wall(new Vector3d(-10, 0, 0), 11, 1, this);
		murGauche.rotate90(1);
		add(murGauche);
		
		//Mur Bas
		Wall murBas = new Wall(new Vector3d(0, 0, 5), 19, 1, this);
		add(murBas);
		
		//Mur Haut
		Wall murHaut = new Wall(new Vector3d(0, 0, -5), 19, 1, this);
		add(murHaut);
		
		//Mur Milieu
		Wall murMilieu = new Wall(new Vector3d(0, 0, 0), 10.5f, 1, this);
		murMilieu.rotate90(1);
		add(murMilieu);
		
		//Buts Gauche
		//Milieu
		Box b1 = new Box(new Vector3d(-9.5, 0, 0), new Vector3f(5, 1, 0.5f), this, rouge);
		b1.rotate90(1);
		add(b1);
		
		//Haut
		Box b2 = new Box(new Vector3d(-9.5, 0, 3.75), new Vector3f(2.5f, 1, 0.5f), this, jaune);
		b2.rotate90(1);
		add(b2);
		
		//Bas
		Box b3 = new Box(new Vector3d(-9.5, 0, -3.75), new Vector3f(2.5f, 1, 0.5f), this, jaune);
		b3.rotate90(1);
		add(b3);
		
		//Buts Droite
		//Milieu
		Box b4 = new Box(new Vector3d(9.5, 0, 0), new Vector3f(5, 1, 0.5f), this, rouge);
		b4.rotate90(1);
		add(b4);
		
		//Haut
		Box b5 = new Box(new Vector3d(9.5, 0, 3.75), new Vector3f(2.5f, 1, 0.5f), this, jaune);
		b5.rotate90(1);
		add(b5);
		
		//Bas
		Box b6 = new Box(new Vector3d(9.5, 0, -3.75), new Vector3f(2.5f, 1, 0.5f), this, jaune);
		b6.rotate90(1);
		add(b6);
	}
}

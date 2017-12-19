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
		Wall murMilieu = new Wall(new Vector3d(0, 0, 0), 11, 1, this);
		murMilieu.rotate90(1);
		add(murMilieu);
		
		//Buts Gauche
		//Milieu
		Arch a1 = new Arch(new Vector3d(-9, 0, 0), this);
		a1.rotate90(1);
		add(a1);
		
		//Haut
		Arch a2 = new Arch(new Vector3d(-9, 0, 3), this);
		a2.rotate90(1);
		add(a2);
		
		//Bas
		Arch a3 = new Arch(new Vector3d(-9, 0, -3), this);
		a3.rotate90(1);
		add(a3);
		
		//Buts Droite
		//Milieu
		Arch a4 = new Arch(new Vector3d(9, 0, 0), this);
		a4.rotate90(1);
		add(a4);
		
		//Haut
		Arch a5 = new Arch(new Vector3d(9, 0, 3), this);
		a5.rotate90(1);
		add(a5);
		
		//Bas
		Arch a6 = new Arch(new Vector3d(9, 0, -3), this);
		a6.rotate90(1);
		add(a6);	
	}
}

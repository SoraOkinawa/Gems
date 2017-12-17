package gems;

import javax.vecmath.Vector3d;
import simbad.sim.Agent;

public class Joueur extends Agent {
	public Joueur (Vector3d position, String name) {
		super(position,name);
	
	}
	
	public void initBehavior() {}
	
	public void performBehavior() {
		setTranslationalVelocity(0.5);
		// changer l'angle fréquemment
		if ((getCounter() % 100)==0)
			setRotationalVelocity(Math.PI/2 * (0.5 - Math.random()));
	}
}

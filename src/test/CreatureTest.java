package test;

import code.Creature;

public class CreatureTest {

	public static void main(String[] args) {
		Creature c = new Creature("c");
		assert c.name.equals("c") : " Name inconsistent";
		assert c.toString().equals("c code.Creature") : " toString unidentified";
		assert false : " Ensuring that tests go through.";
	}

}

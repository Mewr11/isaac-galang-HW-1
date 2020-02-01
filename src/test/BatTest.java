package test;

import code.Ant;
import code.Bat;
import code.Thing;

public class BatTest {

	public static void main(String[] args) {
		Bat b = new Bat("b");
		assert b.name.equals("b") : " Name inconsistent";
		assert b.toString().equals("b Bat") : " toString unidentified";
		Thing t = new Thing("t");
		b.eat(t);
		assert b.eaten == null: " Bat ate inanimate Object";
		Ant a = new Ant("a");
		b.eat(a);
		assert b.eaten.equals(a): " Bat did not eat animate Object";
		b.move();
		assert false: " Ensuring that tests go through.";
	}

}

package test;

import code.Creature;
import code.Thing;

public class CreatureTest extends Creature {

	public CreatureTest(String n) {
		super(n);
	}

	public static void main(String[] args) {
		Creature c = new CreatureTest("c");
		assert c.name.equals("c") : " Name inconsistent";
		assert c.toString().equals("c test.CreatureTest") : " toString unidentified";
		Thing t = new Thing("t");
		assert c.eaten == null : " Empty Stomach is not null";
		c.eat(t);
		assert c.eaten.equals(t) : " Eaten food not stored";
		c.whatDidYouEat();
		assert false : " Ensuring that tests go through.";
	}

	@Override
	public void move() {
	}

}

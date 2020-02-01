package test;

import code.Bat;
import code.Fly;
import code.Thing;

public class FlyTest {

	public static void main(String[] args) {
		Fly f = new Fly("f");
		assert f.name.equals("f") : " Name inconsistent";
		assert f.toString().equals("f Fly") : " toString unidentified";
		Bat b = new Bat("b");
		f.eat(b);
		assert f.eaten == null : " Fly ate animate object";
		Thing t = new Thing("t");
		f.eat(t);
		assert f.eaten.equals(t) : " Fly did not eat inanimate object";
		f.move();
		assert false : " Ensuring tests go through.";
	}

}

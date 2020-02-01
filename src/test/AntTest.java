package test;

import code.Ant;

public class AntTest {

	public static void main(String[] args) {
		Ant a = new Ant("a");
		assert a.name.equals("a") : " Name inconsistent";
		assert a.toString().equals("a Ant") : " toString unidentified";
		a.move();
		assert false : " Ensuring that tests go through.";
	}

}

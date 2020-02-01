package test;

import code.Tiger;

public class TigerTest {

	public static void main(String[] args) {
		Tiger t = new Tiger("t");
		assert t.name.equals("t") : " Name inconsistent";
		assert t.toString().equals("t Tiger") : " toString unidentified";
		t.move();
		assert false : "Ensuring all tests go through.";
	}

}

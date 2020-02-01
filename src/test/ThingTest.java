package test;

import code.Thing;

/**
 * Test class for <code>Thing.java</code>.
 * <hr>
 * Created 01 Feb 2020
 * @author Isaac Galang
 */
public class ThingTest {

	/**
	 * Test function. Yells at you if it doesn't work.
	 * @param args - None
	 */
	public static void main(String[] args) {
		Thing t = new Thing("t");
		assert t.name == "t" : " Name inconsistent";
		assert t.toString() == "t" : " toString improper";
		assert false : " Ensuring that tests go through.";
	}
}

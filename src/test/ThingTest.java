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
		try {
			Thing t = new Thing("t");
		} catch (Exception e) {
			System.out.println("Failed to create new Thing");
		}
	}
}

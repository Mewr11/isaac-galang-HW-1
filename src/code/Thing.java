package code;

/**
 * Everything is a <code>Thing</code>, except things that aren't. In specific, <code>Creature<code/>s are all <code>Thing</code>s.
 * <hr>
 * Created 01 Feb 2020
 * @author Isaac Galang
 */
public class Thing {
	public String name;
	
	public Thing(String n) {
		this.name = n;
	}
	
	public String toString() {
		if(this.getClass().equals(new Thing("").getClass())) {
			return this.name;
		} else {
			return this.name + " " + this.getClass().getSimpleName();
		}
	}
}

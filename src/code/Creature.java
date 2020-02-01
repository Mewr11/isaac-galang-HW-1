package code;

/**
 * <code>Creature</code>s are <code>Thing</code>s that are a little bit more energetic than their inanimate counterparts.
 * @author isaac
 *
 */
public abstract class Creature extends Thing {
	public Thing eaten;
	
	public Creature(String n) {
		super(n);
		eaten = null;
	}
	
	public void eat(Thing t) {
		eaten = t;
		System.out.println(this + " has just eaten a " + t);
	}

	public void whatDidYouEat() {
		// TODO Auto-generated method stub
		
	}
	
	public abstract void move();

}

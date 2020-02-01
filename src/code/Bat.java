package code;

public class Bat extends Creature implements Flyer {

	public Bat(String n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println(this + " is swooping through the air.");
	}

	@Override
	public void move() {
		this.fly();
	}
	
	@Override
	public void eat(Thing t) {
		if(t instanceof Creature) {
			super.eat(t);
		} else if(t instanceof Thing) {
			System.out.println(this + " won't eat a " + t);
		}
	}

}

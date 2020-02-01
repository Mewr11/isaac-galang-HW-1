package code;

public class Fly extends Creature implements Flyer {

	public Fly(String n) {
		super(n);
	}

	@Override
	public void fly() {
		System.out.println(this + " is buzzing around in flight.");
	}

	@Override
	public void move() {
		this.fly();
	}
	
	@Override
	public void eat(Thing t) {
		if(t instanceof Creature) {
			System.out.println(this + " won't eat a " + t);
		} else {
			super.eat(t);
		}
	}

}

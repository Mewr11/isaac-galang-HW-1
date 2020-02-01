package code;

public class Tiger extends Creature {

	public Tiger(String n) {
		super(n);
	}

	@Override
	public void move() {
		System.out.println(this + " has just pounced");
	}

}

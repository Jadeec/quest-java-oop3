public class Eagle extends Bird implements Fly {

	// attributes
	private boolean flying;
	private int altitude;
	private boolean landed;

	// constructor
	public Eagle(String name) {
		super(name);
		this.flying = false;
		this.altitude = 0;
		this.landed = false;
	}

	// getter/setter
	public int getAltitude() {
		return altitude;
	}

	public boolean isFlying() {
		return flying;
	}

	public boolean isLanded() {
		return landed;
	}

	public void setLandedTrue() {
		this.landed = true;
	}

	public void setLandedFalse() {
		this.landed = false;
	}

	// Static methods form Fly interface
	@Override
	public String sing() {
		return "Screech!";
	}

	@Override
	public void takeOff() {
		System.out.println("I'm taking off !");
	}

	@Override
	public int ascend(int meters) {
		System.out.println(" Going up " + meters + " meters");
		return meters;
	}

	public int descend(int meters) {
		System.out.println("Going down" + meters + " meters");
		return meters;
	}

	@Override
	public void land() {
		if (!this.landed) {
			setLandedTrue();
		} else {
			System.out.println(" landed!");
			setLandedFalse();
		}

	}

}

import java.util.Random;

public class TiringDuck implements IDuck{

	private static final int SPEED = 10;
	private final String name;
	private int distance=0;
	private int fatigue=0;
	private final Random random = new Random();
	public TiringDuck(String name) {
		super();
		this.name = name;
	}
	public int getDistance() {
		return distance;
	}
	public int getFatigue() {
		return fatigue;
	}
	public void run() {
		fatigue+= 2*random.nextDouble()*SPEED;
		distance += SPEED - SPEED* ( 1 - 100.0/(100+fatigue));
	}
	public void runSpecial() {
		fatigue+= 2*random.nextDouble()*SPEED;
		distance += SPEED - SPEED* ( 1 - 100.0/(100+fatigue));
	}
	public String showData() {
		return name+" Distance "+distance;
	}
}
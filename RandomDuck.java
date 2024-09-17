import java .util.Random;

public class RandomDuck implements IDuck {

	private static final int SPEED = 10;
	private final String name; 
	private int distance=0;

	private final Random random = new Random();
	public RandomDuck(String name) {
		super();
		this.name = name;
	}
	public void run() {
		distance += SPEED * random.nextDouble();
	}
	public String getName() {
		return name;
	}
	public int getDistance() {
		return distance;
	}
	public String showData() {
		return name+" Distance"+distance;
	}
	
}

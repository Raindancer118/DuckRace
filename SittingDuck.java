import java.util.Random;

public class SittingDuck implements IDuck {
    private static final int SPEED = 0;
    private final String name;
    private int distance=0;

    private final Random random = new Random();
    public SittingDuck(String name) {
        super();
        this.name = name;
    }
    public void run() {
        distance += SPEED;
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
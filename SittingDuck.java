public class SittingDuck implements IDuck{
    private final String name;
    public SittingDuck(String name) {
        super();
        this.name = name;
    }
    public int getDistance() {
        return 0;
    }
    public void run() {
    }
    public void runSpecial(){

    }
    public String showData() {
        return name+" Distance "+0;
    }
}
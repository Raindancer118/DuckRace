public abstract class Duck implements IDuck {
    private final String name="";
    private int distance;
    public String getName() {
        return name;
    }
    public void run(){
        runSpecial();
    }
    protected abstract void runSpecial();
    public int getDistance() {
        return 0;
    }
    public String showData() {
        return name+" Distance "+0;
    }

}
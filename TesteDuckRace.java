
/**
 * Beschreiben Sie hier die Klasse TesteDuckRace.
 * 
 * Stellt ein Duckrace zum Testen zur Verfügung und startet das Rennen.
 * 
 * @author Frank Zimmermann 
 * @version 11.9.2019
 */
public class TesteDuckRace{

    public static void main(String[] args){
        DuckRace r = new DuckRace();
        r.addDuck( new TiringDuck("Tick"));
        r.addDuck(new RandomDuck("Donald"));
        r.addDuck(new SittingDuck("Track"));
        r.race();
    }

    public void testeMeinDuckRace(){
        DuckRace r = new DuckRace();
        r.addDuck( new TiringDuck("Tick"));
        r.addDuck(new RandomDuck("Donald"));
        r.addDuck(new SittingDuck("Track"));
        r.race();
    }
}

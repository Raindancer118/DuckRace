import java.util.ArrayList;

public class DuckRace {

	private final int RACE_DISTANCE = 100;
	private ArrayList<IDuck> ducks = new ArrayList<>();

	public void race() {
		while (!hasWinner()) {
			ducksRun();
		}
	}

	private boolean hasWinner() {
		ArrayList<IDuck> bestDucks = new ArrayList<>();
		int max = 0;
		for (IDuck duck : ducks) {
			if (duck.getDistance() > RACE_DISTANCE) {
				if (duck.getDistance() > max) {
					max = duck.getDistance();
					bestDucks = new ArrayList<>();
					bestDucks.add(duck);
				} else if (duck.getDistance() == max) {
					bestDucks.add(duck);
				}
			}
		}
		if (!bestDucks.isEmpty()) {
			for (IDuck r: bestDucks) {
				System.out.println(r.showData());
			}
		}

		return !bestDucks.isEmpty();
	}

	private void ducksRun() {
		for (IDuck duck : ducks) {
			duck.run();
		}
	}

	public void addDuck (IDuck duck) {
		ducks.add(duck);
	}
}
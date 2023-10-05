package de.unistuttgart.iste.sqa.pse.sheet07.presence;

import de.hamstersimulator.objectsfirst.external.simple.game.SimpleHamsterGame;

/**
 * This class is used to solve some easy tasks.
 */
public class ArtemisPauleHamsterGame extends SimpleHamsterGame {

	/**
	 * Creates a new ArtemisPauleHamsterGame.<br>
	 * Do not modify!
	 */
	public ArtemisPauleHamsterGame() {
		this.loadTerritoryFromResourceFile("/territories/ArtemisPaule.ter");
		this.displayInNewGameWindow();
		game.startGame();
	}

	@Override
	protected void run() {
		// Put your code for part A exercise 1 here.
	}
}

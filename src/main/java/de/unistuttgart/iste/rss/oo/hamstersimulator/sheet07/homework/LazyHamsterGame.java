package de.unistuttgart.iste.rss.oo.hamstersimulator.sheet07.homework;

import de.unistuttgart.iste.rss.oo.hamstersimulator.exceptions.FrontBlockedException;
import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.SimpleHamsterGame;


/**
 * A SimpleHamsterGame with exceptions
 */
public class LazyHamsterGame extends SimpleHamsterGame {
	

	/**
	 * Put the hamster code into this method. Solve the task in this method NOT in
	 * the constructor
	 */
	@Override
	protected void run() {
		this.loadTerritoryFromResourceFile("/territories/territoryExampleSheet.ter");
		this.displayInNewGameWindow();
		game.startGame();
	}
}

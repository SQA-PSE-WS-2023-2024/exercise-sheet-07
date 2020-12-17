package de.unistuttgart.iste.rss.oo.hamstersimulator.sheet07.homework;

import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.SimpleHamsterGame;


/**
 * A SimpleHamsterGame with exceptions
 */
public class LazyHamsterGame extends SimpleHamsterGame {
	

	/**
	 * Creates a new LazyHamsterGame
	 */
	public LazyHamsterGame() {
		super();
		this.loadTerritoryFromResourceFile("/territories/territoryExampleSheet.ter");
		this.displayInNewGameWindow();
		game.startGame();
		game.setSpeed(9);
	}

	/**
	 * ToDo: Call moveNSteps to do five steps.
	 */
	@Override
	protected void run() {
	}
}

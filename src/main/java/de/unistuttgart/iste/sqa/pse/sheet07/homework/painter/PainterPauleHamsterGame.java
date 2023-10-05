package de.unistuttgart.iste.sqa.pse.sheet07.homework.painter;

import de.hamstersimulator.objectsfirst.external.simple.game.SimpleHamsterGame;

/**
 * Describe the purpose of this class here.
 *
 * @author (Your name)
 * @version (a version number or a date)
 */
public class PainterPauleHamsterGame extends SimpleHamsterGame {

	/**
	 * Creates a new PainterPauleHamsterGame.<br>
	 * Do not modify!
	 */
	public PainterPauleHamsterGame() {
		this.loadTerritoryFromResourceFile("/territories/PainterPauleTerritory.ter");
		this.displayInNewGameWindow();
		game.startGame();
	}

	/**
	 * Put the hamster code into this method.
	 */
	@Override
	protected void run() {
		// insert your code here
	}
}

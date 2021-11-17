package de.unistuttgart.iste.sqa.pse.sheet07.homework;

import de.hamstersimulator.objectsfirst.inspector.InspectableSimpleHamsterGame;

public abstract class InternalLazyHamsterGame extends InspectableSimpleHamsterGame {
	/**
	 * This constructor is used for loading a territory for the game and for displaying it.
	 */
	InternalLazyHamsterGame(){
    	this.loadTerritoryFromResourceFile("/territories/territory.ter");
        this.displayInNewGameWindow();
    }
	
	@Override
	protected void run() {
		game.startGame();
		hamsterRun();
		game.stopGame();
		
	}
	
	/**
	 * This method contains everything that the hamster is supposed to do.
	 */
	abstract void hamsterRun();
}

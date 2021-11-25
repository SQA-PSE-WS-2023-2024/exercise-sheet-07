package de.unistuttgart.iste.sqa.pse.sheet07.homework;

import de.hamstersimulator.objectsfirst.exceptions.HamsterException;

public class NowayToGoException extends HamsterException {

	private static final long serialVersionUID = -1850656605851478458L;

	public NowayToGoException() {
		super("Hamster is locked in a single cell");
	}

}

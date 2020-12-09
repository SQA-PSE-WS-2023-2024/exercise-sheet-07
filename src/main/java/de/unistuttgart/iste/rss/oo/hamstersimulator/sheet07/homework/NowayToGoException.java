package de.unistuttgart.iste.rss.oo.hamstersimulator.sheet07.homework;

import de.unistuttgart.iste.rss.oo.hamstersimulator.exceptions.HamsterException;

public class NowayToGoException extends HamsterException {

	private static final long serialVersionUID = -1850656605851478458L;

	public NowayToGoException() {
		super("Hamster is locked in a single cell");
	}

}

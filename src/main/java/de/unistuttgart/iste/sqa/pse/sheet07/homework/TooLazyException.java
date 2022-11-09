package de.unistuttgart.iste.sqa.pse.sheet07.homework;

import de.hamstersimulator.objectsfirst.exceptions.HamsterException;

/**
 * Exception used when a hamster is too lazy to move (see sheet07, part B, ex 2)
 *
 * @author zimmersn
 *
 */
public class TooLazyException extends HamsterException {

	private static final long serialVersionUID = 2197114733579949656L;

	public TooLazyException() {
		super("Hamster too lazy to move");
	}
}

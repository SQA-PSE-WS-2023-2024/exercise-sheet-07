package de.unistuttgart.iste.rss.oo.hamstersimulator.sheet07.homework;

import de.unistuttgart.iste.rss.oo.hamstersimulator.exceptions.HamsterException;

/**
 * @author zimmersn
 *
 */
public class TooLazyException extends HamsterException {

	private static final long serialVersionUID = 2197114733579949656L;

	public TooLazyException() {
		super("Hamster too lazy to move");
	}

}

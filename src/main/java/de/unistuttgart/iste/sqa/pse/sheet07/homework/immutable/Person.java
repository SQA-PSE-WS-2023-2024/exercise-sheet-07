package de.unistuttgart.iste.sqa.pse.sheet07.homework.immutable;

import java.util.*;

/**
 * Represents a person with a name and parents.
 */
public class Person {
	// @ private instance invariant name != null && name.length() > 0;
	// @ private instance invariant parenstsName >= ;

	public String name;
	public List<String> parentsName;

	/*@
	@ requires name != null && name.length() > 0;
	@ requires parentsName != null &&  parentsName.size() <= 2
	@ ensures this.name == name;
	@ ensures this.parentsName == parentsName;
	@*/
	/**
	 * Creates a new person with the given name.
	 * @param name Name of the person.
	 * @param parentsName Names of parents of this person
	 * @throws IllegalArgumentException If the preconditions are not satisfied.
	 */
	public Person(final String name, final List<String> parentsName) throws IllegalArgumentException {
		if (name == null || name.length() == 0 || parentsName == null || parentsName.size() >= 3) {
			throw new IllegalArgumentException(
					"A person may not have a null or empty name, and parents must not be null nor be there more than 2 parents");
		}
		this.name = name;
		this.parentsName = parentsName;
	}

	/*@
	@ ensures \result == name;
	@*/
	/**
	 * @return This person's name.
	 */
	public /*@ pure @*/ String getName() {
		return name;
	}

	/*@
	@ ensures \result == parents;
	@*/
	/**
	 * @return This person's parents.
	 */
	public /*@ pure @*/ List<String> getParentsName() {
		return parentsName;
	}

	/*@
	@ requires name != null;
	@ ensures this.name == name;
	@*/
	/**
	 * Sets this person's name.
	 * @param name The new name.
	 * @throws IllegalArgumentException If the preconditions are not satisfied.
	 */
	public void setName(final String name) throws IllegalArgumentException {
		if (name == null || name.length() == 0) {
			throw new IllegalArgumentException("A person may not have a null or empty name.");
		}
		this.name = name;
	}

	/*@
	@ requires parents != null && parentsName.size() <= 2;
	@ ensures this.parentsName == parentsName;
	@*/
	/**
	 * Sets this person's parents names .
	 * @param parents The new parents name.
	 * @throws IllegalArgumentException If the preconditions are not satisfied.
	 */
	public void setParentsName(final List<String> parentsName) throws IllegalArgumentException {
		if (parentsName == null || parentsName.size() > 3) {
			throw new IllegalArgumentException("A pesons parents can never be null nor be there more than 2 parents ");
		}
		this.parentsName = parentsName;
	}
}

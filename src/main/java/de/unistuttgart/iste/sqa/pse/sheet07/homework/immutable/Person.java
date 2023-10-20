package de.unistuttgart.iste.sqa.pse.sheet07.homework.immutable;

/**
 * Represents a person with a name and an optional spouse. The represented
 * persons come from a slightly odd society, where each person must have
 * one spouse for their entire lifetime. 
 */
public class Person {
	// @ private instance invariant name != null && name.length() > 0;
	// @ private instance invariant spouse != null;

	public String name;
	public Person spouse;

	/*@
	@ requires name != null && name.length() > 0;
	@ requires spouse != null;
	@ ensures this.name == name;
	@ ensures this.spouse == spouse;
	@*/
	/**
	 * Creates a new person with the given name.
	 * @param name Name of the person.
	 * @param spouse Spouse of this person
	 * @throws IllegalArgumentException If the preconditions are not satisfied.
	 */
	public Person(final String name, final Person spouse) throws IllegalArgumentException {
		if (name == null || name.length() == 0 || spouse == null) {
			throw new IllegalArgumentException(
					"A person may not have a null or empty name, and the spouse must not be null");
		}
		this.name = name;
		this.spouse = spouse;
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
	@ ensures \result == spouse;
	@*/
	/**
	 * @return This person's spouse.
	 */
	public /*@ pure @*/ Person getSpouse() {
		return spouse;
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
	@ requires spouse != null && !spouse.equals(this);
	@ ensures this.spouse == spouse;
	@*/
	/**
	 * Sets this person's spouse .
	 * @param spouse The new spouse.
	 * @throws IllegalArgumentException If the preconditions are not satisfied.
	 */
	public void setSpouse(final Person spouse) throws IllegalArgumentException {
		if (spouse == null || spouse.equals(this)) {
			throw new IllegalArgumentException("A persons spouse can never be null or equal to the person themselves.");
		}
		this.spouse = spouse;
	}
}

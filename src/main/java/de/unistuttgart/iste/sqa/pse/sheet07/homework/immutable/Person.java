package de.unistuttgart.iste.sqa.pse.sheet07.homework.immutable;

import java.util.Date;
/**
 * Represents a person with a name and birthdate. 
 * 
 * @author your name
 */
public class Person {
	//@ private instance invariant name != null && name.length() > 0;
	//@ private instance invariant birthDate != null;
	
	public String name;
	public Date birthDate;
	
	/*@
	  @ requires name != null && name.length() > 0;
	  @ requires birthDate != null;
	  @ ensures this.name == name;
	  @ ensures this.birthDate == birthDate;
	  @*/
	/**
	 * Creates a new person with the given name and birthdate.
	 * 
	 * @param name Name of the person.
	 * @param birthDate Birth date of the person.
	*/
	public Person(final String name, final Date birthDate) {
		if (name == null || name.length() == 0) {
			throw new IllegalArgumentException("A person may not have a null or empty name");
		}
		if (birthDate == null) {
			throw new IllegalArgumentException("A person's birth date must not be null.");
		}
		this.name = name;
		this.birthDate = birthDate;
	}
	

	/**
	 * @return This person's name.
	 */
	public /*@ pure @*/ String getName() {
		return name;
	}
	

	/**
	 * @return This person's birth date.
	 */
	public /*@ pure @*/ Date getBirthDate() {
		return birthDate;
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
	  @ requires birthDate != null;
	  @ ensures this.birthDate == birthDate;
	  @*/
	/**
	 * Sets this person's birth date.
	 * 
	 * @param birthDate The new birth date.
	 */
	public void setBirthDate(final Date birthDate) {
		if (birthDate == null) {
			throw new IllegalArgumentException("A person's birth date must not be null.");
		}
		this.birthDate = birthDate;
	}
	
}
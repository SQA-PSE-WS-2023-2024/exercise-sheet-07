package de.unistuttgart.iste.sqa.pse.sheet07.presence;

/**
 * class representing an address, do NOT modify!
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Address {
	private String streetname;
	private int streetnumber;
	private String postalcode;
	private String cityname;

	public Address(final String streetname, final int streetnumber, final String postalcode, final String cityname) {
		this.streetname = streetname;
		this.streetnumber = streetnumber;
		this.postalcode = postalcode;
		this.cityname = cityname;
	}

	public String getStreetname() {
		return streetname;
	}

	public void setStreetname(final String streetname) {
		this.streetname = streetname;
	}

	public int getStreetnumber() {
		return streetnumber;
	}

	public void setStreetnumber(final int streetnumber) {
		this.streetnumber = streetnumber;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(final String postalcode) {
		this.postalcode = postalcode;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(final String cityname) {
		this.cityname = cityname;
	}
}
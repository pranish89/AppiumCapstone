package POJO;

public class Address {
	
	private String street;
	private String city;
	private String zip;
	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}
	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	public String toString()
	{
		return "\"address\" : {\r\n"
				+ "	         	\"street\" : \""+street+"\",\r\n"
				+ "	         	\"city\": \""+city+"\",\r\n"
				+ "	         	\"zip\" : \""+zip+"\"\r\n"
				+ "	         	}, ";
	}

}

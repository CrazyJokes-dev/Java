package TA1201;

public class address {
	private String street;
	private String city;
	private int zip;
	private String country;
	
	public address(String street) {
		this.street = street;
	}
	
	public address(String street, String city) {
		this(street);
		this.city = city;
	}
	
	public address(String street, String city, int zip) {
		this(street, city);
		this.zip = zip;
	}
	
	public address(String street, String city, int zip, String country) {
		this(street, city, zip);
		this.country = country;
	}
	
	//Making this because I don't feel like typing the same thing over like 4 times
	//This method also prints out the variables that we are given
	public void printMembers() {
		if(street != null && city != null && country != null)
			System.out.println(street +" "+ city +" "+ zip + " "+ country);
		else if(street != null && city != null && String.valueOf(zip).length() == 5)
			System.out.println(street +" "+ city +" "+ zip);
		else if(street != null && city != null)
			System.out.println(street +" "+ city);
		else if(street != null)
			System.out.println(street);
			
	}
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}



	public static void main(String[] args) {
		

	}

}

package TA1201;

public class Student {
	private String name;
	private address address;
	private double propertyValue;
	private double propertyTax;
	
	public Student(String name) {
		this.name = name;
	}
	
	public Student(String name, address  address) {
		this(name);
		this.address = address;
	}
	
	public Student(String name, address address, double propertyValue, double percentTax) {
		this(name, address);
		this.propertyValue = propertyValue;
		this.propertyTax = percentTax;
		
	}
    
	public String getName() {
		return name;
	}
	
	public address getAddress() {
		return address;
	}
	
	public double getPropertyValue() {
		return propertyValue;
	}

	public void setPropertyValue(double propertyValue) {
		this.propertyValue = propertyValue;
	}

	public double getPropertyTax() {
		return propertyTax/100;
	}

	public void setPropertyTax(double percentTax) {
		this.propertyTax = percentTax;
	}


	public double ComputePropertyTaxes(boolean isRental) {
		double taxOwed = propertyValue*getPropertyTax();
		if(isRental)
			return -1;
		else
			return taxOwed;
	}
	
	public static void main(String args[]) {
		Student s = new Student("Estefan");
		s.setPropertyValue(105000);
		s.setPropertyTax(1.634);
		
		System.out.println(s.ComputePropertyTaxes(false));
		System.out.println(s.ComputePropertyTaxes(true));
	}
}
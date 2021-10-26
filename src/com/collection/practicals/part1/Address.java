package com.collection.practicals.part1;

public class Address {

	String city,street,pin,zip;
	
	public Address(String city, String street,String pin,String zip)
	{
		super();
		this.city = city;
		this.street = street;
		this.pin = pin;
		this.zip = zip;
	}
	@Override
	public boolean equals(Object o)
	{
		if(o instanceof Address)
		{
			Address a = (Address) o;
			if(this.city.equals(a.city) && this.street.equals(a.street) && this.pin.equals(a.pin)
					&& this.zip.equals(a.zip))
				return true;
			else
				return false;
		}
		else
			throw new IllegalArgumentException("Pass only Address");
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + ", pin=" + pin + ", zip=" + zip + "]";
	}
	
}

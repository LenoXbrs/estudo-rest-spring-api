package br.com.lenox.model;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String FirstName;
	private String LastName;
	private String Address;
	private String Gender;
	
	
	
	public Person() {
		
	}



	public String getFirstName() {
		return FirstName;
	}



	public void setFirstName(String firstName) {
		FirstName = firstName;
	}



	public String getLastName() {
		return LastName;
	}



	public void setLastName(String lastName) {
		LastName = lastName;
	}



	public String getAddress() {
		return Address;
	}



	public void setAddress(String address) {
		Address = address;
	}



	public String getGender() {
		return Gender;
	}



	public void setGender(String gender) {
		Gender = gender;
	}
	
	


	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	@Override
	public int hashCode() {
		return Objects.hash(Address, FirstName, Gender, LastName, id);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(Address, other.Address) && Objects.equals(FirstName, other.FirstName)
				&& Objects.equals(Gender, other.Gender) && Objects.equals(LastName, other.LastName) && id == other.id;
	}
	
	
	
	

}

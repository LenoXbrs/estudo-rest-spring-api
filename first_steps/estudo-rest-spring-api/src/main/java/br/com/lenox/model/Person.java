package br.com.lenox.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "person")
public class Person implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "first_name", nullable = false, length = 80)
	private String FirstName;
	@Column(name = "last_name", nullable = false, length = 80)
	private String LastName;
	@Column(name = "address", nullable = false, length = 80)
	private String Address;
	@Column(name = "gender", nullable = false, length = 20)
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

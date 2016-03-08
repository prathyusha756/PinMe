package pinme.getsetter;

import java.sql.Date;

public class User {
	private int id;
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String email;
	private int phoneNumber;
	private Date sinceInternal;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getSinceInternal() {
		return sinceInternal;
	}

	public void setSinceInternal(Date sinceInternal) {
		this.sinceInternal = sinceInternal;
	}

}

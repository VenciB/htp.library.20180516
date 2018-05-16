package by.htp.library.entity;

public class Author {
	
	private String firstName;
	private String lastName;
	private String otchestvo;
	private int dateOfBirth;
	private int author_id;
	
	public Author( ) {
		this.firstName =  "Unknown";
		this.lastName = "Unknown";
		this.otchestvo = "Unknown";
		this.dateOfBirth = 0;
		this.author_id = 0;
	}
	
	public Author(
				String firstName, 
				String lastName, 
				String otchestvo, 
				int dateOfBirth,
				int author_id ) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.otchestvo = otchestvo;
		this.dateOfBirth = dateOfBirth;
		this.author_id = author_id;
	}

	// get/set date of birth:
	public int getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	// get/set first name:
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	// get/set last name:
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	// get/set otchestvo:
	public String getOtchestvo() {
		return otchestvo;
	}
	public void setOtchestvo(String otchestvo) {
		this.otchestvo = otchestvo;
	}

	public int getAuthor_id() {
		return author_id;
	}
	
//	public Author[] clone( ) {
//		return this;
//	}

//	public void setAuthor_id(int author_id) {
//		this.author_id = author_id;
//	}
	
}

package interfaces�dev1;
import java.util.Date;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private Date DateOfBirth;
	private String NationalityId;
	public Customer() {
		
	}
	public Customer(int id, String firstName, String lastName, Date i, String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		DateOfBirth = i;
		NationalityId = nationalityId;
	}
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
	public Date getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}

}

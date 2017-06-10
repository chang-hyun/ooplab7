import java.io.Serializable;
import java.util.ArrayList;


public class std implements Serializable{

	
	private String firstName;
	private String lastName;
	private boolean gender;
	private int age;
	private int semester;
	private ArrayList<std> s = new ArrayList<std>();
	
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


	public boolean isGender() {
		return gender;
	}


	public void setGender(boolean gender) {
		this.gender = gender;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getSemester() {
		return semester;
	}


	public void setSemester(int semester) {
		this.semester = semester;
	}


	public std(String firstName, String lastName, boolean gender, int age, int semester)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.semester = semester;
	}
}

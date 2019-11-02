package singlyLinkedLists;

public class Employee {
	private String firstName;
	private String lastName;
	private int id;
	
	public Employee(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int hashCode() {
		return firstName.hashCode() + lastName.hashCode()+id;
	}

	public boolean equals(Object o) {
		if(this == o) return true;
		if((o==null) || getClass() != o.getClass()) return false;
		
		Employee emp = (Employee) o;
		if((id == emp.id) && (firstName.equals(emp.firstName) && (lastName.equals(emp.lastName)))){
			return true;
		}else {
			return false;
		}
	}

	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + "]";
	}
	
	
	
	
	
	
	

}

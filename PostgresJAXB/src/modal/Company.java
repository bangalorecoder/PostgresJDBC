package modal;

//Created By Amit kumar

import java.sql.Date;

public class Company {

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getAddress() {
		return address;
	}
	public void setAddress(char address) {
		this.address = address;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + address;
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((joinDate == null) ? 0 : joinDate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(salary);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Company other = (Company) obj;
		if (address != other.address)
			return false;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (joinDate == null) {
			if (other.joinDate != null)
				return false;
		} else if (!joinDate.equals(other.joinDate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(salary) != Float.floatToIntBits(other.salary))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Company [id=" + id + ", " + (name != null ? "name=" + name + ", " : "") + "age=" + age + ", address="
				+ address + ", salary=" + salary + ", " + (joinDate != null ? "joinDate=" + joinDate : "") + "]";
	}


	private int id;
	private String name;
	private int age;
	private char address;
	private float salary;
	private Date joinDate;
	
	
}

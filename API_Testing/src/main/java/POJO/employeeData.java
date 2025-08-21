package POJO;

import java.util.List;

public class employeeData {
	
	private int id;
	private String name;
	private int age;
	private String email;
	private Address address;
	private List<String> skills;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	/**
	 * @return the skills
	 */
	public List<String> getSkills() {
		return skills;
	}
	/**
	 * @param skills the skills to set
	 */
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	
	public String toString()
	{
		return "{\r\n"
				+ "		\r\n"
				+ "	         \"id\"    : "+id+",\r\n"
				+ "	         \"name\"  : \""+name+"\",\r\n"
				+ "	         \"age\"   : "+age+",\r\n"
				+ "	         \"email\" : \""+email+"\",\r\n"
				+ "	         "+address+""
				+ "	     \r\n       "
				+ "          \"skills\": "+skills+""
				+ "       \r\n"
				+ "	      }"
				+ "";
	}
}

package JSON_Serialization;

import java.util.ArrayList;
import java.util.Arrays;

import POJO.Address;
import POJO.employeeData;

public class employeeDateSerialization {

	public static void main(String[] args) {

		/* Create an object of Address class using Has A relationship
		 * 
		 */
		
		Address address = new Address();
		address.setStreet("1st main street");
		address.setCity("New York");
		address.setZip("10001");
		
		//Create an object employeeData class
		employeeData emp1 = new employeeData();
		emp1.setId(78);
		emp1.setName("John Doe");
		emp1.setAge(30);
		emp1.setEmail("JohnDoe@example.com");
		emp1.setAddress(address);
		emp1.setSkills(Arrays.asList("\"Java\"","\"SpringBoot\"","\"SQL\""));
		
		System.out.println(emp1);
		
	}

}

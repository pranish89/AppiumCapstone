package JSON_payloadreading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import io.restassured.path.json.JsonPath;

public class ReadSimpleJson {

	public static void main(String[] args) throws IOException {
		
		//read the simple json data and converts into jsonpath object
		String filepath="..\\API_Testing\\src\\test\\resources\\JSON Files\\Simple.json";
		String jsonpayload = new String(Files.readString(Paths.get(filepath)));
		JsonPath path = new JsonPath(jsonpayload);
		//Take the data
		int empid =path.getInt("employee.id");
		String name = path.getString("employee.name");
		int age = path.getInt("employee.age");
		String email = path.getString("employee.email");
		System.out.println("employee id: " +empid +"\n" +"employee name: " +name +"\n" +"employee age: " +age +"\n" +"email: " +email);
	}
	

}

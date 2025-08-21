package JSON_payloadreading;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import io.restassured.path.json.JsonPath;

public class ReadIntermediateJson {

	public static void main(String[] args) throws IOException {
		String filepath="..\\API_Testing\\src\\test\\resources\\JSON Files\\intermediate.json";
		String jsonpayload = new String(Files.readString(Paths.get(filepath)));
		JsonPath path = new JsonPath(jsonpayload);
		List<Map<String,Object>> employees = path.getList("employees");
		
		for(Map<String,Object> employee:employees)
		{
			int empid = (int) employee.get("id");
			String empname = (String) employee.get("name");
			int empage = (int)employee.get("age");
			String email = (String)employee.get("email"); 
			System.out.println("Employee Id " +empid +"\n" +"Employeename " +empname +"\n" +"Employee age " +empage +"\n" +"employee Email " +email );
			
			System.out.println("-------------------------------------------------------");
			//getting the address
			Map<String, String> address = (Map<String,String>)employee.get("address");
			System.out.println("Street Name: " +address.get("street"));
			System.out.println("City: " +address.get("city"));
			System.out.println("Zip: " +address.get("zip"));
			
			System.out.println("-------------------------------------------------------");
			//getting the skills
			List<String> skills = (List<String>)employee.get("skills");
			System.out.println("Skills " +String.join(", ", skills));
			System.out.println("-------------------------------------------------------");

			
		}
		
		
	}

}

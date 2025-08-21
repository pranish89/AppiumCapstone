package fakeStoreAPI;

import static io.restassured.RestAssured.given;
/*
 *  Methods register_user () method is to add a new user, 
 *  the added user will not be reflecting in the fakestore API database.
 *  auth_token() method is to obtain a token with already registered user in FakeStore API .
 *  For testing purpose I have taken existing userid : "mor_2314".
 *  The token from response is stored in global variable.
 *  TestNG file is API_testng.xml.  
 */

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class UserManagement {

	static String token;
	
	@Test
	public static void registerUser()
	{
		RestAssured.baseURI="https://fakestoreapi.com/";
		String response=given()
				.log()
				.all()
				.header("accept","application/json")
				.header("Content-Type","application/json")
				.body("{\r\n"
						+ "    \"address\": {\r\n"
						+ "        \"geolocation\": {\r\n"
						+ "            \"lat\": \"40.3467\",\r\n"
						+ "            \"long\": \"-40.1310\"\r\n"
						+ "        },\r\n"
						+ "        \"city\": \"san Antonio\",\r\n"
						+ "        \"street\": \"adams St\",\r\n"
						+ "        \"number\": 245,\r\n"
						+ "        \"zipcode\": \"80796-1234\"\r\n"
						+ "    },\r\n"
						+ "    \"email\": \"john.doe@example.com\",\r\n"
						+ "    \"username\": \"johndoe\",\r\n"
						+ "    \"password\": \"password123\",\r\n"
						+ "    \"name\": {\r\n"
						+ "        \"firstname\": \"derek\",\r\n"
						+ "        \"lastname\": \"powell\"\r\n"
						+ "    },\r\n"
						+ "    \"phone\": \"1-956-001-1945\"\r\n"
						+ "}\r\n"
						+ "")
				.when()
				.post("/users")
				.then()
				.log()
				.all()
				.assertThat()
				.statusCode(200).extract().response().asString();
				System.out.println("New User is registered");
				System.out.println("***************************************************************************");
	}
	
	// The priority is set in negative value to run it at first, since it has many dependent methods.
	@Test(priority=-1,groups= {"auth_token"})
	public static void authToken()
	{
		/*New user "johnDoe" from the method Create_User is not getting registered in the 
		 * fakestore API database
		 * Hence using already existing user to acquire token.
		 */

		RestAssured.baseURI="https://fakestoreapi.com";
		String response =given()
				.log()
				.all()
				.header("accept","application/json")
				.header("Content-Type","application/json")
				.body("{\r\n"
						+ "    \"username\": \"mor_2314\",\r\n"
						+ "    \"password\": \"83r5^_\""
						+ "        \r\n"
						+ "}")
				.when()
				.post("/auth/login")
				.then()
				.log().all()
				.assertThat()
				.statusCode(200).extract().response().asString();
		JsonPath path = new JsonPath(response);
		token = path.getString("token");
		System.out.println("User is logged in and token is obtained");
		System.out.println("***************************************************************************");


	}
	
}

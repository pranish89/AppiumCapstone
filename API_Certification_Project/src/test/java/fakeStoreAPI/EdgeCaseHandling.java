package fakeStoreAPI;

/*
 * For the Unauthorized Access used the real time website link
 * TestNG file is API_testng.xml.
 */

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class EdgeCaseHandling {

	@Test
	public static void unauthorizedAccess() {

		// The URI needs authorized entry, hence using it here for testing.
		RestAssured.baseURI = "https://api.imgur.com/";
		Response response = given().log().all().when().get("3/account/me/images").then().log().all().statusCode(401)
				.extract().response();
		if (response.statusCode() == 401) {
			System.out.println("The site is Unauthorized " + response.statusLine());
		}
		
		System.out.println("***************************************************************************");

	}

}

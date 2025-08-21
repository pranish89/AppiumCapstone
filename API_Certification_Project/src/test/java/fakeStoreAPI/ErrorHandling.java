package fakeStoreAPI;
/*
 * TestNG file is API_testng.xml
 */

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ErrorHandling {
	@Test
	public static void createInvalidProduct() {
		RestAssured.baseURI = "https://fakestoreapi.com";
		Response response = given().log().all().header("accept", "application/json")
				.header("Content-Type", "application/json")
				.body("{\r\n" + "    \"price\": \"29.99\",\r\n" + "    \"description\": \"This is a new product\",\r\n"
						+ "    \"image\": \"https://example.com/product.jpg\",\r\n"
						+ "    \"category\": \"electronics\",\r\n" + "    \"jhjh\":\"jhjhjgg\",r\n" + "}")
				.when().post("/products").then().log().all().assertThat().statusCode(400).extract().response();

		if (response.statusCode() == 400) {
			System.out.println("The request API is not processed" + "\n" + response.statusLine());
		}

		System.out.println("***************************************************************************");

	}

}

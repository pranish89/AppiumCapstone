package fakeStoreAPI;
/* 
 * This class includes the Order details information,it has create_order,
 * Retrieve_order and delete_order methods
 * Used with Parameterization in the TestNG file and dependsOnMethods Annotations.
 * Retrieve_Order() and delete_order() will have the same order id.
 * These methods depends on the User_Managament.auth_token method for Bearer Authorization.
 * TestNG file is API_testng.xml
 */

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class OrderProcessing {

	@Test(dependsOnGroups = {"auth_token"})
	@Parameters({"order_create_userid"})
	public static void newOrder(int userid)
	{
		RestAssured.baseURI="https://fakestoreapi.com/";
		String response=given()
				.log()
				.all()
				.header("Authorization", "Bearer " +UserManagement.token)
				.header("accept","application/json")
				.header("Content-Type","application/json")
				.body("{\r\n"
						+ "    \"userId\": "+userid+",\r\n"
						+ "    \"date\": \"2024-08-18\",\r\n"
						+ "    \"products\": [\r\n"
						+ "        {\r\n"
						+ "            \"productId\": 1,\r\n"
						+ "            \"quantity\": 2\r\n"
						+ "        },\r\n"
						+ "        {\r\n"
						+ "            \"productId\": 2,\r\n"
						+ "            \"quantity\": 1\r\n"
						+ "        }\r\n"
						+ "    ]\r\n"
						+ "}")
				.when()
				.post("carts")
				.then()
				.log()
				.all()
				.assertThat()
				.statusCode(200).extract().response().asString();
		JsonPath path = new JsonPath(response);
		
		//Verifying the UserId from the request and response
		int res_userid = path.getInt("userId");
		if(res_userid==userid)
		{
			System.out.println("New order is created and the response has the correct User id  " +res_userid);
		}

		//Verifying the product information
		List<Map<String,Integer>> products = path.getList("products");
		for(Map<String,Integer> product:products)
		{
			int productid = product.get("productId");
			int quantity = product.get("quantity");
			System.out.println("The productid is " +productid +" quantity is " +quantity);
			System.out.println("***************************************************************************");


		}
	}


	@Test(dependsOnGroups = {"auth_token"})
	@Parameters({"order_retrieve_id"})
	public static void retrieveOrder(int orderid)	
	{			
		RestAssured.baseURI="https://fakestoreapi.com/";
		String res=given()
				.log()
				.all()
				.header("Authorization", "Bearer " +UserManagement.token)
				.when()
				.get("carts/"+orderid)
				.then()
				.log()
				.all()
				.assertThat()
				.statusCode(200).extract().response().asString();
		JsonPath path = new JsonPath(res);
		int responseid = path.getInt("id");
		if(responseid==orderid)

		{
			System.out.println("Correct order information is retrieved with orderid " +responseid);
		}
		System.out.println("***************************************************************************");

	}


	@Test(dependsOnGroups = {"auth_token"},dependsOnMethods = {"retrieveOrder"})
	@Parameters({"order_delete_id"})
	public static void deleteOrder(int orderid)
	{
		RestAssured.baseURI="https://fakestoreapi.com/";
		String res=given()
				.log()
				.all()
				.header("Authorization", "Bearer " +UserManagement.token)
				.when()
				.delete("carts/"+orderid)
				.then()
				.log()
				.all()
				.assertThat()
				.statusCode(200).extract().response().asString();
		JsonPath path = new JsonPath(res);
		int responseid = path.getInt("id");
		if(responseid==orderid)

		{
			System.out.println("The cart of given orderid is deleted successfully " +responseid);
		}
		System.out.println("***************************************************************************");


	}





}

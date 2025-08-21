package Petstore;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class crud_operation {
	
	static int orderid;

	public static void Get_Inventory()
	{
		RestAssured.baseURI = "https://petstore.swagger.io/v2/";
		given()
		 	.log()
		 	.all()
		 	.header("accept","application/json")
		.when()
			.get("store/inventory")
		.then()
			.log()
			.all()
			.assertThat()
			.statusCode(200);
		
	}
	
	public static void create_order() throws IOException
	{
		//Read the JSON Payload from JSON file.
		String filepath = "..\\API_Testing\\src\\test\\resources\\JSON Files\\CreateOrder.json";
		String jsonpayload = new String(Files.readString(Paths.get(filepath)));
		RestAssured.baseURI = "https://petstore.swagger.io/v2/";
		String response = given()
		.log()
		.all()
		.header("accept","application/json")
		.header("Content-Type","application/json")
		/*.body("{\r\n"
				+ "  \"id\": 1,\r\n"
				+ "  \"petId\": 3,\r\n"
				+ "  \"quantity\": 20,\r\n"
				+ "  \"shipDate\": \"2024-12-14T15:53:45.452Z\",\r\n"
				+ "  \"status\": \"available\",\r\n"
				+ "  \"complete\": true\r\n"
				+ "}")*/
		//.body(payloadClass.payload()
		//.body(payloadClass.Optimizedpayload(2, 12,30,"pending",true)
		.body(jsonpayload )
		.when()
		.post("store/order")
		.then()
		.log()
		.all()
		.assertThat()
		.statusCode(200).extract().response().asString();
		JsonPath path = new JsonPath(response);
		orderid = path.getInt("id");

		
	}
	
	public static void getOrderById(int statuscode)
	{
		RestAssured.baseURI = "https://petstore.swagger.io/v2/";
		String response = given()
		 	.log()
		 	.all()
		 	.header("accept","application/json")
		.when()
			.get("store/order/"+orderid)
		.then()
			.log()
			.all()
			.assertThat()
			.statusCode(statuscode).extract().response().asString();
		JsonPath path = new JsonPath(response);
		if(statuscode==400 ||statuscode==404)
		{
			String message = path.getString("message");
			System.out.println("Message: " +message);
		}
	}
	
	public static void deleteOrderById()
	{
		RestAssured.baseURI = "https://petstore.swagger.io/v2/";
		given()
		 	.log()
		 	.all()
		 	.header("accept","application/json")
		.when()
			.delete("store/order/"+orderid+"")
		.then()
			.log()
			.all()
			.assertThat()
			.statusCode(200);
			/*.extract().response().asString();
		JsonPath path = new JsonPath(response);
		String message = path.getInt("message");
		System.out.println(message);
		*/
	}
	
	
	public static void main(String[] args) throws IOException {
		
		Get_Inventory();
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		create_order();
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		getOrderById(200);
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		deleteOrderById();
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		getOrderById(404);
	}

}

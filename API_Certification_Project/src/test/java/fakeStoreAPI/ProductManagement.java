package fakeStoreAPI;

/*
 * Product_Management class has 4 methods, create_product,retrieve_product,
 * update_product and delete_product
 * these methods are parameterized using @parameter annotation to take the value from TestNG file.
 * TestNG file is API_testng.xml
 * 
 */

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ProductManagement {
	@Test
	public static void createProduct() {
		RestAssured.baseURI = "https://fakestoreapi.com";
		String response = given().log().all().header("accept", "application/json")
				.header("Content-Type", "application/json")
				.body("{\r\n" + "                    \"title\": \"New Product\",\r\n"
						+ "                    \"price\": 29.99,\r\n"
						+ "                    \"description\": \"This is a new product\",\r\n"
						+ "                    \"image\": \"https://example.com/product.jpg\",\r\n"
						+ "                    \"category\": \"electronics\"\r\n" + "}")
				.when().post("/products").then().log().all().assertThat().statusCode(200).extract().response()
				.asString();
		JsonPath path = new JsonPath(response);
		String title = path.getString("title");
		int id = path.getInt("id");
		System.out.println("Id of newly created product " + id);
		if (title.equalsIgnoreCase("New Product")) {
			System.out.println("New product is created and product title is as expected " + title);
		}
		System.out.println("***************************************************************************");

	}

	@Test(dependsOnMethods = "createProduct()")
	@Parameters({ "product_retrieve_id" })
	public static void retrieveProduct(int id) {

		RestAssured.baseURI = "https://fakestoreapi.com/";
		String res = given().log().all()
				// .header("accept","application/json")
				.when().get("products/" + id).then().log().all().assertThat().statusCode(200).extract().response()
				.asString();
		JsonPath path = new JsonPath(res);
		int responseid = path.getInt("id");
		if (responseid == id)

		{
			System.out.println("Correct product information is retrieved with productid " + responseid);
		}
		System.out.println("***************************************************************************");

	}

	@Test(dependsOnMethods = "createProduct()")
	@Parameters({ "product_update_id", "product_update_title", "product_update_price" })
	public static void updateProduct(int id, String title, double price) {
		RestAssured.baseURI = "https://fakestoreapi.com/";
		String response = given().log().all().header("accept", "application/json")
				.header("Content-Type", "application/json")
				.body("{\r\n" + "                    \"title\": \"" + title + "\",\r\n"
						+ "                    \"price\": " + price + ",\r\n"
						+ "                    \"description\": \"This is a new product\",\r\n"
						+ "                    \"image\": \"https://example.com/product.jpg\",\r\n"
						+ "                    \"category\": \"electronics\"\r\n" + "}")
				.when().put("products/" + id).then().log().all().assertThat().statusCode(200).extract().response()
				.asString();
		JsonPath path = new JsonPath(response);
		String responsetitle = path.getString("title");
		if (responsetitle.equals(title)) {
			System.out.println("Product title is updated as per request " + responsetitle);
		}
		System.out.println("***************************************************************************");

	}

	@Test(dependsOnMethods = "updateProduct()")
	@Parameters({ "product_delete_id" })
	public static void deleteProduct(int id) {
		RestAssured.baseURI = "https://fakestoreapi.com/";
		String res = given().log().all().when().delete("products/" + id).then().log().all().assertThat().statusCode(200)
				.extract().response().asString();
		JsonPath path = new JsonPath(res);
		int responseid = path.getInt("id");
		if (responseid == id)

		{
			System.out.println("The product is deleted with productid " + responseid);
		}
		System.out.println("***************************************************************************");

	}

}

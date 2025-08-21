package JSON_Serialization;

import POJO.Category;
import POJO.Product;

public class productSerializationTest {

	public static void main(String[] args) {
	
		//using Has A relationship
		//Create a Category Object
      Category category = new Category();
      
      category.setId(2);
      category.setName("Electronics");
      
      //Create a Product Object
      Product product =new Product();

      product.setId(105);
      product.setName("Bluetooth Speakers");
      product.setPrice(49.99);
      product.setCategory(category);
      System.out.println(product);
      
	}

}

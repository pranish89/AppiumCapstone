package POJO;

public class Product {

	private int id;
	private String name;
	private double price;
	private Category category;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the category
	 */
	public Category getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(Category category) {
		this.category = category;
	}
	
	public String toString()
	{
		return " {\r\n"
				+ "        \"id\" : "+id+",\r\n"
				+ "	       \"name\": \""+name+"\",\r\n"
				+ "	       \"price\": "+price+",\r\n"
				+   ""+category+""
				+"}"
				;
	}
}

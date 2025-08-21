package ResdingJSON;

public class payloadClass {

	public static String payload()
	{
		return "{\r\n"
				+ "  \"id\": 1,\r\n"
				+ "  \"petId\": 3,\r\n"
				+ "  \"quantity\": 20,\r\n"
				+ "  \"shipDate\": \"2024-12-14T15:53:45.452Z\",\r\n"
				+ "  \"status\": \"available\",\r\n"
				+ "  \"complete\": true\r\n"
				+ "}";
	}
	public static String Optimizedpayload(int orderid,int petid,int quantity,String status,boolean iscomplete)
	{
		return "{\r\n"
				+ "  \"id\": "+orderid+",\r\n"
				+ "  \"petId\": "+petid+",\r\n"
				+ "  \"quantity\": "+quantity+",\r\n"
				+ "  \"shipDate\": \"2024-12-14T15:53:45.452Z\",\r\n"
				+ "  \"status\": \""+status+"\",\r\n"
				+ "  \"complete\": "+iscomplete+"\r\n"
				+ "}";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

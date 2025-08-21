package interfaces_enums;

public class Bikes implements Vehicle{
	
	String bike_name;
	double mileage;
	double power;
	

	@Override
	public void setter(String a, double b, double c) {
		
		 bike_name=a;
		 mileage= b;
		 power= c;
			}

	@Override
	public void getter() {
		
		System.out.println("The Performance of bike " +bike_name +"\n" +"Mileage is " +mileage +"\n" +"Power is " +power);
	}

}

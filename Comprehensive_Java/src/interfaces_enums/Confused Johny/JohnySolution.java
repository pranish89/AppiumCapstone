package interfaces_enums;

public class JohnySolution {

	public static void main(String[] args) {
		
		Bikes pulsar = new Bikes();
		pulsar.setter("Pulsar150", 47.5 , 14 );
		Bikes yamaha = new Bikes();
		yamaha.setter("YamahaFZ", 60, 12.2);
		Bikes hero = new Bikes();
		hero.setter("Hero Extreme", 66, 11.5);
		Bikes honda = new Bikes();
		honda.setter("HondaCBR150",38,17.1);
		
		//compare mileage
		if(pulsar.mileage>yamaha.mileage && pulsar.mileage>hero.mileage && pulsar.mileage>honda.mileage)
		{
			System.out.println("Mileagewise " +pulsar.bike_name +" is better with mileage of " +pulsar.mileage );
			
		}
		else if(yamaha.mileage>pulsar.mileage && yamaha.mileage>hero.mileage && yamaha.mileage>honda.mileage)
		{
			System.out.println("Mileagewise " +yamaha.bike_name +" is better with mileage of " +yamaha.mileage );
						
		}
		else if(hero.mileage>pulsar.mileage && hero.mileage>yamaha.mileage && hero.mileage>honda.mileage)
		{
			System.out.println("Mileagewise " +hero.bike_name +" is better with mileage of " +hero.mileage );

		}
		else
		{
			System.out.println("Mileagewise " +honda.bike_name +" is better with mileage of " +honda.mileage );

		}
		
		//compare power
				if(pulsar.power>yamaha.power && pulsar.power>hero.power && pulsar.power>honda.power)
				{
					System.out.println("powerwise " +pulsar.bike_name +" is better with power of " +pulsar.power );
					
				}
				else if(yamaha.power>pulsar.power && yamaha.power>hero.power && yamaha.power>honda.power)
				{
					System.out.println("powerwise " +yamaha.bike_name +" is better with power of " +yamaha.power );
								
				}
				else if(hero.power>pulsar.power && hero.power>yamaha.power && hero.power>honda.power)
				{
					System.out.println("powerwise " +hero.bike_name +" is better with power of " +hero.power );

				}
				else
				{
					System.out.println("powerwise " +honda.bike_name +" is better with power of " +honda.power );

				}

	}

}

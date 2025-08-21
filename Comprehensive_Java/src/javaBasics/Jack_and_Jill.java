package javaBasics;

import java.util.Scanner;

/*Jack and Jill Leisure ActivityJack and Jill were getting bored so they decided to play a game.
In this game there are 10 cards.Each card has a message written on it. 
Jack asks Jill to choose one card from 1 to10. 
Then,Jack reveals the message written on the card that was selected by Jill.
Make a programto implementthe game that is played by them. Message on every choice should be different.
Implement it using switch case construct.
*/
public class Jack_and_Jill {

	public static void main(String[] args) {
		//Create a scanner object for getting input
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the Card No: \n");
		int card = obj.nextInt();
		
		switch(card)
		{
		default:
			System.out.println("please choose any card 1-10");
		break;			
		
		case 1:
		
			System.out.println("The card number is 1 , Welcome!");
			break;
			
		case 2:
		
			System.out.println("The card number is 2 , Good Luck");
			break;
			
		case 3:
			
			System.out.println("The card number is 3 , Happy Learning!");
			break;
			
		case 4:
			
			System.out.println("The card number is 4 ,Life is Beautiful!");
			break;
			
		case 5:
			
			System.out.println("The card number is 5 , Pancha Pandavas!");
			break;
			
		case 6:
			
			System.out.println("The card number is 6 , Enjoy the Moment!");
			break;
			
		case 7:
			
			System.out.println("The card number is 7 , Everyday is a new Begining!");
			break;
			
		case 8:
			
			System.out.println("The card number is 8 ,Travel the World !");
			break;
			
		case 9:
			
			System.out.println("The card number is 9 , Navagrahas!");
			break;
			
		case 10:
			
			System.out.println("The card number is 2 , Adieu!");
			break;
			
			
			}
		
		
		}
		
	}



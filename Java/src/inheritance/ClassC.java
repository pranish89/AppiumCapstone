package inheritance;

final class ClassC extends ClassB{ //Class C cannot be extended since its final but objects cannot be created.

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassB B = new ClassB();
		ClassA A= new ClassA();

		//obj.display(); //from immediate parent ClassB
		//obj.c;//private members of parent class cannot be accessed by sub class
		//obj.j;//static members of parent should not be accessed via sub class objects
		System.out.println(ClassB.j);
		A.display();
		B.display();
	}

}

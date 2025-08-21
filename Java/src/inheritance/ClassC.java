package inheritance;

final class ClassC extends ClassB{ //Class C cannot be extended since its final but objects cannot be created.

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassC obj = new ClassC();
		obj.display(); //from immediate parent ClassB
		obj.displayparent(); //from super parent ClassA
		//obj.c;//private members of parent class cannot be accessed by sub class
		//obj.j;//static members of parent should not be accessed via sub class objects
		System.out.println(ClassB.j);

	}

}

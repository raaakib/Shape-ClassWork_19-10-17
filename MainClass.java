
public class MainClass {
	static void doSomething(Shape T) {
		try {
			if(T instanceof Shape2D) {
				System.out.println("This is class Shape2D");
			}
			else if(T instanceof Shape3D) {
				System.out.println("This is class Shape3D");
			}
			else{
				throw new Error();
            }
		}
		catch(Error E) {
			System.out.println("This is an Exception");
		}
	}
	
	void func(Shape ... s) {
		System.out.println("Calling function");
		for(Shape newshape : s) {
			doSomething(newshape);
		}
}
	public static void main(String[] args) {
		System.out.println("---Creating an object");
		Shape newShape = new Shape();
		System.out.println("---Creating an object");
		Square sqr= new Square();
		System.out.println("---Doing Something");
		doSomething(newShape);///this shows exception cz Shape is parent class of Shape2D;
        doSomething(sqr);///this will declare that Square is inherited from class Shape2D;

	}

}

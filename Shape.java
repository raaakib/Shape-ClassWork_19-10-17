
public  class Shape {
Shape() {
	System.out.println("Creating class Shape");
}

}

class Shape2D extends Shape{
Shape2D() {
		System.out.println("Creating class Shape2D");
	}
	
	
}

class Shape3D extends Shape{
 Shape3D() {
		System.out.println("Creating class Shape3D");
	}
	
	
}

class Cube extends Shape3D{
	
Cube() {
		System.out.println("Creating class Cube::Shape3D");
	}
	
	
}

class Sphere extends Shape3D{
	
Sphere() {
		System.out.println("Creating class Sphere::Shape3D");
	}
	
	
}

class Quad extends Shape2D{
	
Quad() {
		System.out.println("Creating class Quad::Shape2D");
	}
	
	
}
class Triangle extends Shape2D{
	
Triangle() {
		System.out.println("Creating class Triangle::Shape2D");
	}
	
	
}
class RightTriangle extends Triangle{
	
RightTriangle() {
		System.out.println("Creating class RightTriangle::Triangle");
	}
	
	
}
class Rectangle extends Quad{
	
Rectangle() {
		System.out.println("Creating class Rectangle::Quad");
	}
	
	
}
class Square extends Quad{
	
Square() {
		System.out.println("Creating class Square::Quad");
	}
	
	
}

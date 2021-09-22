abstract class Shape{
	int a=2,b=3;
	abstract void printArea();
}

class Rect extends Shape{
	void printArea(){
		double area=a*b;
		System.out.println("Area of Rectangle: "+area);
	}
}

class Tri extends Shape{
	void printArea(){
		double area=0.5*a*b;
		System.out.println("Area of Triangle: "+area);
	}
}

class Circle extends Shape{
	void printArea(){
		double area=3.14*a*a;
		System.out.println("Area of Circle: "+area);
	}
}

public class ShapeArea{
	public static void main(String[] args) {
		Rect obj=new Rect();
		obj.printArea();
		Tri obj1=new Tri();
		obj1.printArea();
		Circle obj2=new Circle();
		obj2.printArea(); 
	}
}

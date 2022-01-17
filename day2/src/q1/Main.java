package q1;

class Circle{
	private double radius;
	private String color ="Red";
	
	Circle(){
		radius=1.0;
		
	}
	Circle(double r){
		radius=r;
	}
	public double getRadius() {
		return radius;
		
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
}
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();
		Circle c2=new Circle(5);
		
		System.out.println("Radius of cicle 1:"+c.getRadius());
		System.out.println("Radius of cicle 2:"+c2.getRadius());
		System.out.println("Area of cicle 1:"+c.getArea());
		System.out.println("Area of cicle 2:"+c2.getArea());
	}

}

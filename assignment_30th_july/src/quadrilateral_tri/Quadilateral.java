package quadrilateral_tri;
import java.util.*;

public class Quadilateral {
	static double area(double l, double b)
	{
		return l*b;
	}
	static double area(double s)
	{
		return s*s;
	}
	static double area(double a,double b,double h )
	{
		return(a+b)* h/2;
	}
	

	public static void main(String[] args) {
		
		System.out.println(" 1: for  Area of Rectangle\n 2:  for  Area of Sqaure\n 3:  for  Area of Trapezium");
		System.out.println(" Enter the Choice:-->  ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
	   	
		if(s.equalsIgnoreCase("1"))
		{
			System.out.println("Enter length of rectangle");
			double l=sc.nextDouble();
			System.out.println("Enter Breadth of rectangle");
			double b=sc.nextDouble();
			System.out.println("Area of rectangle is:");
			System.out.println(area(l,b));
		}
		if(s.equalsIgnoreCase("2"))
		{
			System.out.println("Enter Side of Square");
			double l=sc.nextDouble();
			System.out.println("Area of square is:");
			System.out.println(area(l));
		}
		if(s.equalsIgnoreCase("3"))
		{
			System.out.println("Enter length of one parallel side");
			double l=sc.nextDouble();
			System.out.println("Enter length of another parallel side");
			double b=sc.nextDouble();
			System.out.println("Enter Height of trapezium");
			double h=sc.nextDouble();
			System.out.println("Area of trapezium is:");
			System.out.println(area(l,b,h));
		}
		
	    }
	}



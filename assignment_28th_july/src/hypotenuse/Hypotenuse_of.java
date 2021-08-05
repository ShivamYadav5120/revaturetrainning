
package hypotenuse;

import java.util.Scanner;

public class Hypotenuse_of {

	public static void main(String[] args) {
		int a,b;
		float c=0;
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=(float)Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		System.out.println("Hypotenuse c is "+c);
		
		
		

	}

}

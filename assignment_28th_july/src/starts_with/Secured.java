
package  starts_with;

import java.util.Scanner;

public class Secured {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         if(s.startsWith("https"))
         System.out.println("Secured");
         else 
        	 System.out.println("not Secured");
         
	}

}

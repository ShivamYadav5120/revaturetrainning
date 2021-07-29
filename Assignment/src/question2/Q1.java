/*Question 1
Try to solve these four problems:
1. Given a website address as a string, extract the domain name. For example,
 if the website address is "https://en.wikipedia.org/wiki/Main_Page", then it should return "en.wikipedia.org" as the domain name.
*/

package question2;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 String s=sc.nextLine();
		 String s1[]=s.split("/");
		 System.out.println(s1[2]);
		  
		
	}

}

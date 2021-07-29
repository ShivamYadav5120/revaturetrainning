/*  Question 2
Try to solve these four problems:

2. Given a website address as a string, find out if the website is secure or not. 
A website address starting with "http" is not secure and a website with "https" is secure.

 */




package question2;

import java.util.Scanner;

public class Q2 {

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

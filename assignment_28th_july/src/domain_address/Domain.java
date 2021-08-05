package domain_address;

import java.util.Scanner;

public class Domain {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 String s=sc.nextLine();
		 String s1[]=s.split("/");
		 System.out.println(s1[2]);  
		
	}

}

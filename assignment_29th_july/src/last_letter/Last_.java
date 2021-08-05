package last_letter;

import java.util.Scanner;

public class Last_ {

	public static void main(String[] args) {

		
		 Scanner sc=new Scanner(System.in);
		 String s=sc.nextLine();
		 String[] a1=s.split(" ");
		 String hello="";
		 for(int i=0;i<a1.length;i++) {
			 hello=hello+convertLast(a1[i])+" ";
		 }
		 System.out.println(hello);
		 
		}
	static String convertLast(String s)
	{
		char a=s.charAt(s.length()-1);
		char n=Character.toUpperCase(a);
		return s.substring(0,s.length()-1)+n;
	}

}
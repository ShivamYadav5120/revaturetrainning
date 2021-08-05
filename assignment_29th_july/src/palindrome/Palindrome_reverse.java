
package palindrome;
import java.util.Scanner;
public class Palindrome_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		String str[]=s.split(" ");
		String Fina="";
		for(String x:str) {
			Fina=Fina=isPalindrome(x)+" ";
		}
		System.out.println(Fina);

	}
	static String isPalindrome(String ss) {
		if(isP(ss)) {
			return ss;
		}
		else
		{
			StringBuilder sb=new StringBuilder(ss);
			sb.reverse();
			return sb.toString();
					
		}
		
	}
	public static boolean isP(String a) {
		StringBuilder sb=new StringBuilder(a);
		sb.reverse();
		String s1=sb.toString();
		return a.equals(s1);
	}

}


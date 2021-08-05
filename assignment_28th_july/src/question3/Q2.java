/*Question 2
 * If The word Is Odd Length Then Convert Middle letter to UpperCase else Convert First Letter To UpperCase*/
package question3;
import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		String str=t.nextLine();
		System.out.println(convert(str));
		t.close();
	}
	static String convert(String str) {
		if(str.length()%2==0) {
			char a=str.charAt(0);
			return Character.toUpperCase(a)+str.substring(1,str.length());
		}
		else {
			int z=str.length();
			char b=str.charAt(0);
			char c=Character.toUpperCase(b);
			return str.substring(0,str.length()/2)+c+str.substring(z+1);
		}
		
	}

}

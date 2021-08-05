package question3;
public class Ch 
{
	  void find(String str) {
		  int i,j;
		String[] s=str.split(" ");
		int a=s.length;
		System.out.println("Length of String Is:--  "+a);
		for(i=0;i<1;i++) {
			for(j=1;j<a;j++) {
				if(s[i].length()<s[j].length()) {
					String s1;
					s1=s[i];
					s[i]=s[j];
					s[j]=s1;
				}
				
			}
		}
		for(i=0;i<1;i++) {
		System.out.println(s[0]);
		}
		
		
	}

	public static void main(String[] args) {
    String str="Helo howwwwww Are doing Areeeeee You i";
    Ch c=new Ch();
   c.find(str);

	}

}

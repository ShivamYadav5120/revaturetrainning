package stream_task;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Image {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			
		
   FileInputStream in= new FileInputStream("D:\\Image.png");
   FileOutputStream o = new FileOutputStream("D:\\new.jpg");
   BufferedInputStream B=new BufferedInputStream(in);
   BufferedOutputStream Bo= new BufferedOutputStream(o);
   
   int a =0;
   while(a!=-1) {
	   a=B.read();
	   Bo.write(a);
   }
   B.close();
   Bo.close();
		}
		 catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

}
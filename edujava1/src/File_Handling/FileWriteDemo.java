package File_Handling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileWriteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
    	   Writer fw=new FileWriter("D:\\testout.txt");
    	   fw.write("I Love my Country");
    	   fw.close();
    	   
    	   Reader fr=new FileReader("D:\\\\testout.txt");
    	   int size=fr.read();
    	   while(fr.read()>=0)
    	   {
    		   System.out.println((char)fr.read());
    	   }
    			
    	   
       }catch(Exception e) 
       {
    	   System.out.println(e);
    	   System.out.println("Success..............");
       }
	}

}

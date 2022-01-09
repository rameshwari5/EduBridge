package File_Handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileTestStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	int bWrite[]= {11,12,13,14,15};
        	OutputStream os= new FileOutputStream("D:/MyFile.txt");
        	for(int x=0;x<bWrite.length;x++)
        	{
        		os.write(bWrite[x]);
        	}
        	os.close();
        	InputStream is=new FileInputStream("D:/File23.txt");
        	int size=is.available();
        	for(int i=0;i<size;i++)
        	{
        		System.out.print((char)is.read()+"");
        		
        	}is.close();
        	
        }catch(IOException e){
        	System.out.print("Exception"+e);
        	
        }
        
	}

}

package File_Handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 byte[] array = new byte[50];
		    try {
		      FileInputStream sourceFile = new FileInputStream("D:\\\\MyFile.txt");
		      FileOutputStream destFile = new FileOutputStream("D:\\\\testout.txt");

		      // reads all data from input.txt
		      sourceFile.read(array);

		      // writes all data to newFile
		      destFile.write(array);
		      System.out.println("The txt file is copied to newFile.");

		      // closes the stream
		      sourceFile.close();
		      destFile.close();
		    }
		    catch (Exception e) {
		      e.getStackTrace();
		    }

	}

}

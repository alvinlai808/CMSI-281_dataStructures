package copiersupport;

import java.io.FileReader;
import java.util.Scanner;

public class SourceFile {

	Scanner sc;
	String fileName;
	FileReader in = null;

	public void openFile() {

		System.out.print( "Enter the name of the file you want to open: ");
		fileName = sc.nextLine();
		// System.out.println( "user input: " + fileName );
		// in = new FileReader( fileName );
	}
	
}

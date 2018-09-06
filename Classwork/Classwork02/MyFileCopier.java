// import copiersupport.*;
import java.util.Scanner;

public class MyFileCopier {

	Scanner sc = new Scanner( System.in );
	String fileName;

	public static void main( String[] args ) {
		
		System.out.println( "Please enter a file name" );
		fileName = sc.nextLine();
		System.out.println( "user input: " + fileName );

	}
}

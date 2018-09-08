/*
 * Takes specified text file from user and creates a copy into a new text file
 */

import copiersupport.*;
import java.util.Scanner;

public class MyFileCopier {

   private static Scanner sc = new Scanner( System.in );
   private static String fileName;
   static String content;

   public static void main( String[] args ) {
      
      // Prompt user for name of text file
      System.out.println( "Please enter the name of the file you'd like to copy" );
      fileName = sc.nextLine();

      // Reads through file, then copies content to new file
      SourceFile sf = new SourceFile( fileName );
      content = sf.getContent();
      TargetFile tf = new TargetFile( fileName, content );

   }
}

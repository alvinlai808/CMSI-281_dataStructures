import copiersupport.*;
import java.util.Scanner;
import java.io.IOException;

public class MyFileCopier {

   private static Scanner sc = new Scanner( System.in );
   private static String fileName;
   static String content;

   public static void main(String[] args) {
      
      System.out.println( "Please enter the name of the file you'd like to copy" );
      fileName = sc.nextLine();

      SourceFile sf = new SourceFile( fileName );
      content = sf.getContent();

      TargetFile tf = new TargetFile( fileName, content );
   }
}

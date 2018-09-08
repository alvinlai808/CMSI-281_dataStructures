/*
 * Opens and retrieves content of source file specified by user
 */

package copiersupport;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SourceFile {

   private String content = "";
   private BufferedReader br;

   // Opens file, reads and saves content to a String
   public SourceFile( String fileName ) {
      try {
         br = new BufferedReader( new FileReader( fileName ) );
         content = br.readLine();
         br.close();
      } catch ( IOException ioe ) {

      }
   }

   public String getContent() {
      return content;
   }
}

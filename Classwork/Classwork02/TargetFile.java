/*
 * Writes content of source file into a new file
 */

package copiersupport;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TargetFile {

   private BufferedWriter bw;

   // Opens new file with original file name + ".copy"
   // Copies content from source file into the new file
   public TargetFile( String fileName, String content ) {
      try {
         bw = new BufferedWriter( new FileWriter( fileName + ".copy" ) );
         bw.write( content );
         bw.close();
      } catch( IOException ioe ) {

      }
   }
}

package copiersupport;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TargetFile {

   public TargetFile( String fileName, String content ) {
      try {
         BufferedWriter bw = new BufferedWriter( new FileWriter( fileName + ".copy" ) );
         bw.write( content );
      } catch( IOException ioe ) {

      }
   }
}

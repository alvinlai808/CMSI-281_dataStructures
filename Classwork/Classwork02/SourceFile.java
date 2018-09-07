package copiersupport;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SourceFile {

	private String content;
	
	public SourceFile( String fileName ) {
		try {
			BufferedReader br = new BufferedReader( new FileReader( fileName ) );
			content = br.readLine();
		} catch( IOException ioe ) {

		}
	}

	public String getContent() {
		return content;
	}
}

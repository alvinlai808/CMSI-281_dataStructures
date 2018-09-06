/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  * File name  :  SayHello.java
  *	Purpose    :  This program says hello to the user after he/she has input a name
  *	@author    :  Alvin Lai
  *	Date       :  2018-09-03
  *	Description:  This program asks the user for his/her name, then reads the input
  *				  from the user to output "Hello, *name*!"
  * Notes 	   :  None
  * Warnings   :  None
  *
  * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  * Revision History
  * ================
  *   Ver      Date     Modified by:  Reason for change or modification
  *  -----  ----------  ------------  ---------------------------------------------
  *  1.0.0  2018-09-03  Alvin Lai     Initial writing and begin coding
  *	 1.0.1  2018-09-03	Alvin Lai	  Completed header
  *  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */

import java.util.Scanner;

public class SayHello {
	
	public static void main( String [] args ) {
		Scanner myInput = new Scanner( System.in );
		System.out.println( "What is your name?" );
		String inputName = myInput.nextLine();
		System.out.println( "Hello, " + inputName + "!" );
	}
}

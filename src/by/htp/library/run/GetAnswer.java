package by.htp.library.run;

import java.util.Scanner;

public class GetAnswer {
	
	public String getAnswer( Scanner in ) {
        System.out.println( "Enter your option: " );
        return in.nextLine();
	} // end method getAnswer

} // end class GetAnswer

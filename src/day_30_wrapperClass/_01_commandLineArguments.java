package day_30_wrapperClass;

import java.util.Arrays;

/**
 * @author esalkan
 *
 */
public class _01_commandLineArguments {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		/**
		 * When we compile our *.java program file via command line (terminal)
		 * what arguments a,b,c, apple, true, var=1, etc... these are args and 
		 * before we compile and run the our java file what we write inside the main
		 * method this main method inside commands will run for our String[] args.
		 * 
		 * I understand well maybe didnt explain well :) sorry
		 */

	}

}

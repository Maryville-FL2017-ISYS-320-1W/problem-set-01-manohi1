/*
  	ISYS 320
  	Name(s): Mohammed Anohi
  	Date:  11/22/2017
*/

public class ScalableNumbersRight {
	public static final int MAX = 5;
	public static void main(String[] args) {
		for( int line = 1; line <= MAX; line++ ) {
			for( int spacesIndex = 1; spacesIndex <= MAX - line; spacesIndex++ ) {
				System.out.print(" ");
			}
			for( int numbersIndex = 1; numbersIndex <= line; numbersIndex++ ) {
				System.out.print( line );
			}
			System.out.println();
		}

	}

}

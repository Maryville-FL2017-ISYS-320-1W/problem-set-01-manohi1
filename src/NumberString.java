/*
  	ISYS 320
  	Name(s): Mohammed Anohi
  	Date:  11/22/2017
*/

/* 6. Your pseudocode algorithm here
initialize maxline to 3
initialize maxnumber to 0.
for (each value of countline i.e. from maxline to 1) 
	{
			
			for (each value of countnumber i.e. from maxline to 8) 
			{
				print countnumber
				print countnumber
				print countnumber
			}
		print countnumber
		print countnumber
		printline countnumber
	}

*/

public class NumberString {
	public static final int MAXLINE = 3;
	public static final int MAXNUMBER = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int countline = MAXLINE; countline >= 1; countline--) {
			int countnumber;
			for (countnumber = MAXNUMBER; countnumber <= 8; countnumber++) {
				System.out.print(countnumber);
				System.out.print(countnumber);
				System.out.print(countnumber);
			}
			System.out.print(countnumber);
			System.out.print(countnumber);
			System.out.println(countnumber);
		}
	}

}

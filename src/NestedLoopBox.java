/*
  	ISYS 320
  	Name(s): Mohammed Anohi
  	Date: 11/22/2017
*/

/* 4. Your pseudocode algorithm here

initialize max to 6.
for (each value of countline i.e. from max to 1) 
	{
			for (each value of countstar i.e. from max to 2) 
			{
				print *
			}
		printline *
	}
*/
public class NestedLoopBox {
	public static final int MAX = 6;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int countline = MAX; countline >= 1; countline--) {
			for (int countstar = MAX; countstar > 1; countstar--) {
				System.out.print("*");
			}
			System.out.println("*");
		}

	}
}

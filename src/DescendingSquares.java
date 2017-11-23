/*
  	ISYS 320
  	Name(s): Mohammed Anohi
  	Date: 11/22/2017
*/

/* 2. Your pseudocode algorithm here
initialize max.
for (each value of count i.e. from max to 1) 
{
compute square=count*count
print square
}

*/

public class DescendingSquares {
	public static final int MAX = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int count = MAX; count >= 1; count--) {
			int square = count * count;
			System.out.print(square + " ");
		}
	}

}

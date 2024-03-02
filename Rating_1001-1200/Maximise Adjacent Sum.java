import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		input.nextLine();
		while(t-- > 0) {
		    int n = input.nextInt();
		    int A[] = new int[n];
		    int ans = 0;
		    for(int i = 0 ; i < n; i++) {
		        A[i] = input.nextInt();
		        ans += (2 * A[i]);
		    }
		    Arrays.sort(A);
		    ans -= (A[0] + A[1]);
		    System.out.println(ans);
		}
	}
}

// https://www.codechef.com/problems/SUPCHEF
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int m = s.nextInt();
		    int n = s.nextInt();
		    int k = s.nextInt();
		    int r1 = n*k;
		    String res = r1<m ? "YES" : "NO";
		    System.out.println(res);
		}
	}
}

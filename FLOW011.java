// https://www.codechef.com/problems/FLOW011
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
		    double bs = s.nextInt();
		    double hra,da,gross;
		    if(bs<1500){
		        hra = bs*0.1;
		        da = bs*0.9;
		        gross = bs+hra+da;
		        System.out.println(gross);
		    }else{
		        hra = 500;
		        da = bs*0.98;
		        gross = bs+hra+da;
		        System.out.println(gross);
		    }
		}
	}
}

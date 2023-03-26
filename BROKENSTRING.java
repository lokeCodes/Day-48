// https://www.codechef.com/problems/BROKENSTRING
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
		    int n = s.nextInt();
		    String g = s.next();
		    int r = n/2;
		    int count =0;
		    int ns =0;
		    char arr1[] = new char[n];
		    for(int i=0;i<n;i++){
		        arr1[i]=g.charAt(i);
		    }
		    
		    for(int i=0;i<r;i++){
		        if(arr1[i]!=arr1[i+r]){
		            ns++;
		        }else{
		            count++;
		        }
		    }
		    
		    if(ns>0){
		        System.out.println("NO");
		    }else{
		        System.out.println("YES");
		    }
		}
	}
}

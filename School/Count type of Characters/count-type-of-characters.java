//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		int[] res = new Sol().count (s);
    		
    		for (int i = 0; i < 4; i++)
    		    System.out.println (res[i]);
        }
        
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int[] count (String s)
    {
       int[] a=new int[4];
       for(int i=0;i<s.length();i++){
            int val = (int)(s.charAt(i));
           if(val>=65 && val<=90){
               a[0]++;
           }else if(val>=97 && val<=122){
               a[1]++;
           }else if(val>=48 && val<=57){
               a[2]++;
           }else{
               a[3]++;
           }
       }
       return a;
       
    }
}
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split("\\s+");
            Long n = Long.parseLong(a[0]);
            Long r = Long.parseLong(a[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.nPr(n, r));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long nPr(long n, long r){
         long k=n-r;
         long npr=(factorial(n))/(factorial(k));
         return npr;
    }
      static long factorial(long n){
       
        if(n==0){
            return 1;
        }
        if(n==1){
            return 1;
        }
         return n * factorial(n - 1);
    }
}
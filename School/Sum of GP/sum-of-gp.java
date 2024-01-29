//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine();
            String[] S = s.split(" ");
            long n = Long.parseLong(S[0]);
            Long a = Long.parseLong(S[1]);
            Long r = Long.parseLong(S[2]);
            Solution ob = new Solution();
            Long ans = ob.sum_of_gp(n, a, r);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long sum_of_gp(long n, long a, long r)
    {
        long sum=0;
        if(r==1){
            sum=a*n;
        }else if(r>1){
         long x=(long)Math.pow(r,n);
        sum=(a*(x-1))/(r-1);
        }else{
        long x=(long)Math.pow(r,n);
         sum=(a*(1-x))/(1-r);
        }
       return sum;
    }
}
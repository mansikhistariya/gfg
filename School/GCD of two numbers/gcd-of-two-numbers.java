//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int A = sc.nextInt();
                    int B = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.gcd(A,B));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int gcd(int A , int B) 
    { 
        if(A==B){
            return A;
        }
        if(B==0){
            return A;
        }
          return gcd(B,A%B);//3 % 6=  1)3/6==0.50
          //2) 0*6==0 3)3-0=3 ans
  }
}
//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenlyDivides(N));
        }
    }
}
// } Driver Code Ends

class Solution{
    static int evenlyDivides(int N){
        int count=0;
        String num=String.valueOf(N);
        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);
            int val=Character.getNumericValue(ch);
            if(val==0){
                continue;
            }
            if(N%val==0){
                count++;
            }
        }
        return count;
    
  }
}
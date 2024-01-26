//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N = sc.nextInt();

            Solution ob = new Solution();
            String ans = ob.getBinaryRep(N);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static String getBinaryRep(int N){
        StringBuilder sb=new StringBuilder();
        if(N==0){
            return "0";
        }
     while(N>0){
         int remainder=N%2;
         sb.insert(0,remainder);
         N=N/2;
     } 
     while (sb.length() < 30) {
            sb.insert(0, '0');
        }
     return sb.toString();
    }
}
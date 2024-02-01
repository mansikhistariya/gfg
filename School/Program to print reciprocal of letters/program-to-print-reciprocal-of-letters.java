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
            String S = read.readLine();
            Solution ob = new Solution();
            String reciprocal = ob.reciprocalString(S);
            System.out.println(reciprocal);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static String reciprocalString(String S){
        StringBuilder sb=new StringBuilder();
       for(int i=0;i<S.length();i++){
           int  ch=(int)(S.charAt(i));
           if(ch>=65 && ch<=90){
               char ch1=(char) ('Z' - (ch - 'A'));
               sb.append(ch1);
           }else if(ch>=97 && ch<=122){
               char ch2=(char) ('z' - (ch - 'a'));
               sb.append(ch2);
           }else if(S.charAt(i)==' '){
               sb.append(' ');
           }
       }
       return sb.toString();
    }
}
//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
       String s1 = String.valueOf(n);//remember this
       StringBuilder s2 = new StringBuilder();
       int sum=0;
       for(int i=0;i<s1.length();i++){
           char ch=s1.charAt(i);
           int val = Character.getNumericValue(ch);
           sum+=Math.pow(val,s1.length());
       }
       if(sum==n){
          s2.append("Yes"); 
       }else{
           s2.append("No"); 
       }
       return s2.toString();//stringbulider to string
       
    }
}
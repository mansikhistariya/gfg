//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String A = sc.next();
                    String B = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.UncommonChars(A, B));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String UncommonChars(String A, String B) {
        char charA[] = A.toCharArray();
        char charB[] = B.toCharArray();
        
        int arrA[] = new int[27];
        Arrays.fill(arrA,0);
        for(char cA: charA){
            int valueA = cA-96;
            arrA[valueA]++;
        }
        
        
        int arrB[] = new int[27];
        Arrays.fill(arrB,0);
        for(char cB: charB){
            int valueB = cB-96;
            arrB[valueB]++;
        }
        
        
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<27; i++){
            if((arrA[i]>0  && arrB[i]==0) || (arrB[i]>0  && arrA[i]==0)){
               char c = (char) (i+96);
                sb.append(String.valueOf(c));
            }
        }
        
        return sb.toString().length()==0 ? "-1" : sb.toString();
    }
}

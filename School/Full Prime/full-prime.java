//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.fullPrime(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static int fullPrime(int N){
        //code here
        for(int i=2; i<=Math.sqrt(N); i++){
            if(N%i==0){
                return 0;
            }
        }
        while(N>0){
            if(N%10!=2 && N%10!=3 && N%10!=5 && N%10!=7) return 0;
            N/=10;
        }
        return 1;
    
}
}
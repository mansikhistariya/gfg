//{ Driver Code Starts
//Initial Template for Java




import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            new Solution().immediateSmaller(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    void immediateSmaller(int arr[], int n) {
        
        Stack<Integer> s = new Stack<>();
        
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
               s.push(arr[i+1]); 
            }else {
                
                s.push(-1);
            }
            
        }
        for(int i=n-1;i>=0;i--){
            if(i==n-1){
                arr[n-1]=-1;
            }else{
            //   int k=
               arr[i]=s.pop();
            }
        }
           
    }
}
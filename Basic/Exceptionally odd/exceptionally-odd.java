//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().getOddOccurrence(arr, n);
            System.out.println(ans);
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution {
    int getOddOccurrence(int[] arr, int n) {
        int ans=-1;
       HashMap<Integer,Integer> re=new HashMap<>();
       for(int i=0;i<arr.length;i++){
           if(re.containsKey(arr[i])){
               re.put(arr[i],re.getOrDefault(arr[i],0)+1);
               
           }else{
               re.put(arr[i],1);
           }
       }
       for(int k:re.keySet()){
           if(re.get(k) %2!=0){
               return k;
           }
       }
       
      return ans;
    }
}

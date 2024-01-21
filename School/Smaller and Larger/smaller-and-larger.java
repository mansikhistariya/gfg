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
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans[] = new Solve().getMoreAndLess(arr, n, x);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}


// } Driver Code Ends


//User function Template for Java


class Solve {
    int[] getMoreAndLess(int[] arr, int n, int x) {
        int count1=0,count2=0;
        int a[]=new int[2];
        for(int i=0;i<arr.length;i++){
            if(x>=arr[i]){
                count1++;
                a[0]=count1;
            }
        }
        for(int i=0;i<arr.length;i++){
              if(x<=arr[i]){
                count2++;
                a[1]=count2;
            }
        }
        return a;
    }
}
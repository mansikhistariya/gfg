//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	static BufferedReader br;
    static PrintWriter ot;
    public static void main(String[] args) throws IOException{
        
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());

        while(t-->0){
            
            String s[] = br.readLine().trim().split(" ");
            
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            int a[] = new int[n];
            s = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s[i]);
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(a, n, k);
            for(int ii = 0;ii<res.size();ii++)
                ot.print(res.get(ii) + " ");
            ot.println();
        }
        ot.close();
    }

}
// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        int left= 0,right=0;
       ArrayList<Integer> result = new ArrayList();
       if(arr.length==0)return result;
        int sum = arr[0];
        
        while(left<=right){
            if(sum==s){
                result.add(left+1);
                result.add(right+1);
                return result;
            }else{
               // System.out.println("not same");
               if(right==arr.length+1){
                    result.add(-1);
                    return result;
               }
               if(sum<s){
                     right++;
                     if(right>=0 && right<arr.length){
                     sum+=arr[right];
                }
               }
                else if(sum>s){
                    sum-=arr[left++];
                }
               }
               //System.out.println(left +"==> " + right +"sum " + sum);
               if(left==right+1 && left<arr.length){
                  right = left;
                  sum = arr[left];
               }
            }
          
        
        result.add(-1);
        return result;
    }
}
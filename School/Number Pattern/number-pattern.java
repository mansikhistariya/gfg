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
            int N=sc.nextInt();
            Solution ob = new Solution();
            ArrayList<String> res = ob.numberPattern(N);
            for (int i = 0; i < res.size(); i++){
			    System.out.print(res.get(i)+" ");
            }
			System.out.println();
        }  
    }
}

// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<String> numberPattern(int N){
        ArrayList<String> re=new ArrayList<>();
       
       
        for(int i=1;i<=N;i++){
             String d="";//new string dar valhte
            for(int j=1;j<=i;j++){
                d=d+j;
                
            }
            for(int k=i-1;k>=1;k--){
                d=d+k;
            }  
            re.add(d);
        }
        return  re;
    }
}
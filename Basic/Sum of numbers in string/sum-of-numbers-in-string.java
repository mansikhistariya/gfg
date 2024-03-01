//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st=new StringTokenizer(br.readLine());
	    int t=Integer.parseInt(st.nextToken());
	    while(t-->0){
	        String s=br.readLine();
	        
	        Solution obj = new Solution();
	        
	        System.out.println(obj.findSum(s));
	    }
		
	}
}

// } Driver Code Ends


class Solution{
 public static long findSum(String str)
    {
        // your code here
        int sum=0;
        int num=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){   // It Is Digit
                num=num*10 + str.charAt(i) - '0';    // Convert char to Int
            }
            else {    // If not a Digit
                sum=sum+num;
                num=0;
            }
        }
        return sum+num;
    }
}


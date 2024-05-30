//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.reverse(s));                        
        }
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    private boolean isAlphabetic(char ch)
    {
        return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
    }
    public String reverse(String str)
    {
        char[] arr=str.toCharArray();
        int n=str.length()-1;
        int i=0;
        int j=n;
        while(i<j){
            char ch=arr[i];
            char chj=arr[j];
            
            if(isAlphabetic(ch) && isAlphabetic(chj)){
                 char temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
                  i++;
                  j--;
                
            }else if(!isAlphabetic(ch)){
                i++;
            }else{
                j--;
            }
           
        }
        return String.valueOf(arr);
    }
}
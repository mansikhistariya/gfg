//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
{
	public static void main (String[] args) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int tc=Integer.parseInt(br.readLine().trim());
	 
	 while(tc-- >0)
	 {
	     String line=br.readLine().trim();
	     
	     Solution obj = new Solution();
	     
	     System.out.println(obj.getMaxOccuringChar(line));
	     
	 }
	 }
}
// } Driver Code Ends



class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        HashMap<Character,Integer> re= new HashMap<>();
       
        for(int i=0;i<line.length();i++){
            char ch=line.charAt(i);
            if(re.containsKey(ch)){
                 re.put(ch,re.get(ch)+1);
            }else{
                re.put(ch,1);
            }
        }
            int z=Integer.MIN_VALUE;
            char ans=Character.MAX_VALUE;;
            for(char key:re.keySet()){
                int count=re.get(key);
               if(count>z || (count == z && key < ans)){
                   z=count;
                   ans=key;
                   
               }
              
                
            }
        return ans;
    
    }
    
}
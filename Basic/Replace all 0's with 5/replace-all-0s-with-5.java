//{ Driver Code Starts
import java.util.Scanner;
import java.lang.Math;

class Convert_To_Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            System.out.println(new GfG().convertfive(N));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG {
    int convertfive(int num) {
       StringBuilder sb=new StringBuilder();
       String ans=String.valueOf(num);
       for(int i=0;i<ans.length();i++){
           if(ans.charAt(i)!='0'){
               sb.append(ans.charAt(i));
           }else if(ans.charAt(i)=='0'){
               sb.append('5');
               
           }
          
       }
        String j=sb.toString();
           int intValue = Integer.parseInt(j);
           return intValue;
    }
}
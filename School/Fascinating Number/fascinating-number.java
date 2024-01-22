//{ Driver Code Starts
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Solution ob = new Solution();

        int T = sc.nextInt();

        while (T != 0) {
            long n = sc.nextLong();
            if (ob.fascinating(n))
                System.out.println("Fascinating");
            else
                System.out.println("Not Fascinating");
            T--;
        }
    }
}
// } Driver Code Ends


class Solution {
    boolean fascinating(long n) {
      String s1=String.valueOf(n)+String.valueOf(n*2)+String.valueOf(n*3);
      if(s1.length()!=9){
          return false;
      }
      HashSet<Character> digit = new HashSet<>();
        for (char d : s1.toCharArray()) {
            if (d == '0' || !digit.add(d)) {
                return false;
            }
        }
      return true;
    }
}
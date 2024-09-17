//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.countWrongPlacedBalls(s));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int countWrongPlacedBalls(String s)
    {
        //code here.
        int count  = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'R'){
                if(i%2==1) count++;
            }else{
                if(i%2==0) count++;   
            }
        }
        
        return count;
        
    }

}
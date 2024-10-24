//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    if(obj.decode(s))
                        System.out.println("1");
                        
                    else
                        System.out.println("0");
                        
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public boolean decode(String S)
    {
        //code here
        // S= S.toLowerCase();
        String pattern = "hello";
        int j = 0;
        int end = 5;
        for(int i=0;i<S.length();i++){
            if(j == end){
                return true;
            }
            if(S.charAt(i) == pattern.charAt(j)){
                j++;
            }
        }
        if(j == end) return true;
        
        return false;
    }
}
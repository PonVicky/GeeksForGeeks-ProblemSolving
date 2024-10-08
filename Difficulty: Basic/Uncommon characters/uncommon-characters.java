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
                    String A = sc.next();
                    String B = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.UncommonChars(A, B));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String UncommonChars(String A, String B)
    {
        // code here
        String str = "";
        int[] hash1 = new int[26];
        int[] hash2 = new int[26];
        for(int i=0;i<A.length();i++){
            hash1[A.charAt(i)-'a']++;
        }
        
        for(int i=0;i<B.length();i++){
            hash2[B.charAt(i)-'a']++;
        }
        
        for(int i=0;i<26;i++){
            if((hash1[i]>0 && hash2[i]==0) || (hash1[i] == 0 && hash2[i]>0))
            str+=(char)(i+'a');
        }
        if(str.length() == 0){
            return "-1";
        }        
        return str;
    }
}
//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
            int n = sc.nextInt();

    		System.out.println (new Sol().getCount (s, n)); 
        }
        
    }
}

// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int getCount (String S, int N)
    {
        // your code here
        int[] hash = new int[26];
        hash[S.charAt(0)-'a']++;
        for(int i=1;i<S.length();i++){
            char ch = S.charAt(i);
            if(ch != S.charAt(i-1)){
                hash[ch-'a']++;
            }
        }
        int count  = 0;
        for(int i=0;i<26;i++){
            if(hash[i] == N){
                count++;
            }
        }
        
        return count;
    }
}
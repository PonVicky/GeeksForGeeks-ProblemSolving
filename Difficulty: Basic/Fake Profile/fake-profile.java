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
                    String a = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.solve(a));
                }
                
        }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String solve(String a)
    {
        //code here
       int[] hash = new int[26];
       String out  = "";
       for(char ch : a.toCharArray()){
        if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'){
             hash[ch-'a']++;   
       }
       }
       
       for(char ch : a.toCharArray()){
        if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'){
            if(hash[ch-'a'] == 1){
                out+=ch;
            }else if(hash[ch-'a'] > 1){
                hash[ch-'a'] = 0;
                out+=ch;
            }
        }
       }
       
       if(out.length()%2==0){
           return "SHE!";
       }
       
       return "HE!";
    }
}
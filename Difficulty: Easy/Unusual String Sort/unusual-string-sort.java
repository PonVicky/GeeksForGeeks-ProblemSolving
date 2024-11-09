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
    		System.out.println (new Sol().stringSort (s));
        
System.out.println("~");
}
        
    }
}
// Contributed By: Pranay Bansal
// } Driver Code Ends


//User function Template for Java

class Sol
{
    public static String stringSort (String s)
    {
        // your code here
        int[] low  = new int[26], up = new int[26];
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z'){
                low[ch-'a']++;
            }else{
                up[ch-'A']++;
            }
        }
        String lower  = sort(low,'a'), upper = sort(up,'A');
        
        int n = lower.length(), m=upper.length();
        
        String out  = "";
        for(int i=0;i<Math.max(n,m);i++){
            if(i < m){
                out+=upper.charAt(i);
            }
            
            if(i < n){
                out+=lower.charAt(i);
            }
        }
        
        return out;
        
        
    }
    private static String sort(int[] arr, char x){
        String out = "";
        for(int i=0;i<26;i++){
            if(arr[i] > 0 ){
                if(arr[i] > 1){
                    for(int j=0;j<arr[i];j++){
                        out+=(char)(i + x);
                    }
                }else{
                    out+=(char)(i+x);
                }
            }
        }
        return out;
    }
}
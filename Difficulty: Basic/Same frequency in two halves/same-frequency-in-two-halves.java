//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
            
            Solution ob = new Solution();
            
            if (ob.passed(s)==true)
                System.out.println("YES");
            else
                System.out.println("NO");
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    boolean passed(String s)
    {
        // your code here
        int[] arr = new int[26];
        int n = s.length();
        int mid = n/2;
        
        for(int i=0;i<mid;i++){
            arr[s.charAt(i)-'a']++;
        }
        
        if(n%2==1){
            for(int i=mid+1;i<n;i++){
                arr[s.charAt(i)-'a']--;
            }
        }else{
            for(int i=mid;i<n;i++){
                arr[s.charAt(i)-'a']--;
            }
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        
        return true;
    }
}
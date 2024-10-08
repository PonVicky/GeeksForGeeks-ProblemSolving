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
        // Your code here
        int[] arr = new int[26];
        for(int i=0;i<line.length();i++){
            char ch = line.charAt(i);
            arr[ch-'a']+=1;
        }
        
        int max = -1;
        char out = 0;
        for(int i=0;i<26;i++){
            if(arr[i] >max){
                out = (char)(i+97);
                max = arr[i];
            }
        }
        return out;
    }
    
}
//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String string1 = read.readLine();
            String string2 = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.removeChars(string1,string2) );
        }
    }
}


// } Driver Code Ends


//User function Template for Java
class Solution{
    static String removeChars(String string1, String string2){
        // code here
        String out  = "";
        int[] arr = new int[26];
        for(int i=0;i<string2.length();i++)
        {
            arr[string2.charAt(i)-'a']++;
        }
        for(int i=0;i<string1.length();i++){
            char ch = string1.charAt(i);
            if(arr[ch-'a'] == 0){
                out+=ch;
            }
        }
        return out;
    }
}
//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String s = read.readLine();
            Solution ob = new Solution();
            String ans = ob.transform(s);
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String transform(String S) 
    {
        // code here  
        S=S.toLowerCase();
        String out  = "";
        int count  = 1;
        char c = S.charAt(0);
        for(int i=1;i<S.length();i++){
            char ch = S.charAt(i);
            if(ch == c){
                count++;
            }else{
                out+=count+""+c;
                c = ch;
                count = 1;
            }
        }
        out+=count+""+c;
        return out;
    }
} 
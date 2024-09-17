//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
		    String s=br.readLine();
		    GfG g=new GfG();
		    int len=g.count(s);
		    System.out.println(len);
		}
	}
}

// } Driver Code Ends


/*Complete the function below*/
class GfG{
    public int count(String s)
    {
        //add code here.
        int max = -1, c  = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='1'){
                c++;
            }else{
                if(c > max) max = c;
                c = 0;
            }
        }
        if(c > 0 ){
            if(c > max) max = c;
        }
        return max;
    }
}
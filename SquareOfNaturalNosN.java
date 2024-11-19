import java.io.*;
public class Main
{
	public static void main(String[] args) {
	  BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	  try{
	      int a = Integer.parseInt(bf.readLine());
	      int s = sumOfNaturalNos(a);
	      System.out.println(s);
	  }
	  catch(IOException e){
	      System.out.println("Invalid");
	  }
	}
	static int sumOfNaturalNos(int n){
	    int sum = 0;
	    for(int i = 1; i<=n; i++){
	        sum = sum + (int)Math.pow(i,2);
	    }
	    return sum;
	   
	    
	}
}

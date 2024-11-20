import java.io.*;
public class Main
{
	public static void main(String[] args) {
	   BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	   try{
	       int a = Integer.parseInt(bf.readLine());
	       if(isAutomorphic(a)){
	           System.out.println("True");
	       }
	       else{
	           System.out.println("False");
	       }
	       
	   }
	   catch(IOException e){
	       System.out.println("Invalid");
	   }
	}
	static boolean isAutomorphic(int n){
	    int square = n * n;
	    int temp = n;
	    while(temp > 0){
	        if(temp % 10 != square % 10){
	            return false;
	        }
	        temp = temp/10;
	        square = square/10;
	    }
	    return true;
	}
}

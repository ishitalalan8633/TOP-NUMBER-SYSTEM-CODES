import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	    try{
	        int a = Integer.parseInt(bf.readLine());
	        int b = Integer.parseInt(bf.readLine());
	        int gcd = gcdNo(a,b);
	        System.out.println(gcd);
	    }
	    catch(IOException e){
	        System.out.println("An error occured while input reading");
	    }
	    catch(NumberFormatException e){
	        System.out.println("Invalid number");
	    }
	}
	static int gcdNo(int a, int b){
	    while(a>0 && b>0){
	        if(a>b){
	            a = a%b;
	        }
	        else{
	            b = b%a;
	        }
	    }
	    if(a == 0){
	        return b;
	    }
	    return a;
	}
}

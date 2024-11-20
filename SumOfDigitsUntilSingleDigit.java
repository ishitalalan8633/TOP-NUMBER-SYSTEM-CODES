import java.io.*;
public class Main
{
	public static void main(String[] args) {
	   BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	   try{
	       int a = Integer.parseInt(bf.readLine());
	       int len = sumOf(a);
	       System.out.println(len);
	   }
	   catch(IOException e){
	       System.out.println("Invalid");
	   }
	}
	static int sumOf(int n){
	    int sum = 0;
	    int temp = 0;
	    while( n > 10){
	        n = sum + n/10 + n%10;
	        temp = n;
	    }
	    return temp;
	}
}

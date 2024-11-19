import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	   BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	   try{
	       int a = Integer.parseInt(bf.readLine());
	       int b = length(a);
	       System.out.println(b);
	   }
	   catch(IOException e){
	       System.out.println("Invalid");
	   }
	}
	static int length(int n){
	   int len = 0;
	   while(n != 0){
	       len ++;
	       n = n/10;
	   }
	   return len;
	}
}


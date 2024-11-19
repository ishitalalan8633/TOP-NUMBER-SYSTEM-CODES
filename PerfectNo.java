import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	   BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	   try{
	       int a = Integer.parseInt(bf.readLine());
	       if(isPerfect(a)){
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
	static boolean isPerfect(int n){
	   int sum = 0;
	   for(int i = 1; i<n; i++){
	       if(n % i == 0){
	           sum = sum + i;
	       }
	   }
	   if(sum == n){
	       return true;
	   }
	   return false;
	}
}

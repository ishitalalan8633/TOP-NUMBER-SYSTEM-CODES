import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	   BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	   try{
	       int a = Integer.parseInt(bf.readLine());
	       if(isHarshad(a)){
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
	static boolean isHarshad(int n){
	   int temp = n;
	   int sum = 0;
	   while(temp != 0){
	       int rem = temp%10;
	       sum = sum + rem;
	       temp = temp/10;
	   }
	   if(n % sum == 0){
	       return true;
	   }
	   return false;
	}
}

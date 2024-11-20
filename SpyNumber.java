import java.io.*;
public class Main
{
	public static void main(String[] args) {
	   BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	   try{
	       int a = Integer.parseInt(bf.readLine());
	       if(sumOf(a) == productOf(a)){
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
	static int sumOf(int n){
	    int sum = 0;
	    int temp = n;
	    while(temp != 0){
	        int rem = temp%10;
	        sum = sum + rem;
	        temp = temp/10;
	    }
	    return sum;
	}
	static int productOf(int n){
	    int product = 1;
	    int temp = n;
	    while(temp != 0){
	        int rem = temp%10;
	        product = product * rem;
	        temp = temp/10;
	    }
	    return product;
	}
}

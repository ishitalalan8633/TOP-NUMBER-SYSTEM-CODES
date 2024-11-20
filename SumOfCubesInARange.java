import java.io.*;
public class Main
{
	public static void main(String[] args) {
	   BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	   try{
	       int a = Integer.parseInt(bf.readLine());
	       int b = Integer.parseInt(bf.readLine());
	       int sum = 0;
	       for(int i =a; i<=b; i++){
	           sum = sum + sumOf(i);
	       }
	       System.out.println(sum);
	       
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
	        sum = sum + (int)Math.pow(rem,3);
	        temp = temp/10;
	    }
	    return sum;
	}
	
}

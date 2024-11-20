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
	           if(isPrime(i)){
	               sum = sum + i;
	           }
	           
	       }
	       System.out.println(sum);
	       
	   }
	   catch(IOException e){
	       System.out.println("Invalid");
	   }
	}
	static boolean isPrime(int n){
	    int count = 0;
	    for(int i = 1; i<=n; i++){
	        if(n % i == 0){
	            count ++;
	        }
	    }
	    if(count == 2){
	        return true;
	    }
	    return false;
	}
}

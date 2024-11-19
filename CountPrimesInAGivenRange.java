import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	    try{
	        int a = Integer.parseInt(bf.readLine());
	        int b = Integer.parseInt(bf.readLine());
	        int count = 0;
	        for(int i = a; i<=b; i++){
	            if(isPrime(i)){
	                count ++;
	            }
	        }
	        System.out.println(count);
	    }
	    catch(IOException e){
	        System.out.println("invalid");
	    }
       
	}
	static boolean isPrime(int n){
	    int count = 0;
	    for(int i =1; i<=n; i++){
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

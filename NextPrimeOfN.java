import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	    try{
	        int a = Integer.parseInt(bf.readLine());
	        int next = findNext(a);
	        System.out.println(next);
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
	static int findNext(int n){
	    int num = n + 1;
	    while(!isPrime(num)){
	        num ++;
	    }
	    return num;
	}
}

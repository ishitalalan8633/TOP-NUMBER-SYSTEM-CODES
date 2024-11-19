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
	static boolean isPalindrome(int n){
	    int temp = n;
	    int rev = 0;
	    while(temp != 0){
	        int rem = temp%10;
	        rev = rev*10 + rem;
	        temp = temp/10;
	    }
	    return rev == n;
	}
	static int findNext(int n){
	    int num = n + 1;
	    while(!isPalindrome(num)){
	        num ++;
	    }
	    return num;
	}
}

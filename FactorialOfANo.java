import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		Main obj = new Main();
		//long fact = obj.factNo(a);
		System.out.println(obj.factNo(a));
	}
	static long factNo(int n){
	    if(n == 0){
	        return 1;
	    }
	    else{
	        return n*factNo(n-1);
	    }
	}
}

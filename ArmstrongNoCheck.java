import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main{
    public static void main(String[] args) {
        // Create a BufferedReader to read user input
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        try {
            int n = Integer.parseInt(bf.readLine());
            int len = order(n);
            if(isArmstrong(n,len)){
               System.out.println("True"); 
            }else{
                System.out.println("False");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid decimal number.");
        }
    }
    static int order(int n){
        int len = 0;
        while(n != 0){
            len++;
            n = n/10;
        }
        return len;
        
    }
    static boolean isArmstrong(int n, int len){
        int temp = n;
        int sum = 0;
        while(temp!=0){
            int rem = temp%10;
            sum = sum + (int)Math.pow(rem,len);
            temp = temp/10;
        }
        return sum == n;
    }
}

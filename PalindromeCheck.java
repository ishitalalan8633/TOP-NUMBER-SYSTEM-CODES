import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        // Create a BufferedReader to read user input
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        try {
            
            int n = Integer.parseInt(bf.readLine());
            if(isPalindrome(n)){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
           
            
        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        }
    }

    

 
    static boolean isPalindrome(int n) {
        int rev = 0;
        int temp = n;
        while(temp != 0){
            int rem = temp%10;
            rev = rev*10 + rem;
            temp = temp/10;
        }
        return rev == n;
    }
}

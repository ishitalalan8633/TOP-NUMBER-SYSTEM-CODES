*******************************************************************************/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args) {
        // Create a BufferedReader to read user input
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        try {
            ArrayList<Integer>palindromes = new ArrayList<>();
            int a = Integer.parseInt(bf.readLine());
            int b = Integer.parseInt(bf.readLine());
            for(int i = a; i<=b; i++){
                if(isPalindrome(i)){
                    palindromes.add(i);
                }
                
            }
            System.out.println(palindromes);
        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid decimal number.");
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
}

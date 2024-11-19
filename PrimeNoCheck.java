import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        // Create a BufferedReader to read user input
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        try {
            
            int n = Integer.parseInt(bf.readLine());
            if(isPrime(n)){
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

    

 
    static boolean isPrime(int n) {
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

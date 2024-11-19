import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) {
        // Create a BufferedReader to read user input
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        try {
            int a = Integer.parseInt(bf.readLine());
            int b = Integer.parseInt(bf.readLine());
            for(int i = a; i<=b; i++){
                if(isPrime(i)){
                    System.out.print(i + " ");
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid decimal number.");
        }
    }
    static boolean isPrime(int n){
        int count = 0;
        for(int i=1; i<=n; i++){
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

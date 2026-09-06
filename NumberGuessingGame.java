import java.util.*;
public class NumberGuessingGame{
    public static void Guess(int number, Scanner sc){
        
        int guess;
        int attempt=0;
        do{
            System.out.println("Guess the nnumber (1-100): ");
            guess = sc.nextInt();
            attempt++;
            if(guess>number){
            System.out.println("Large number:  Try again with a smaller number");
            }else if(guess<number){
            System.out.println("Smaller number :  Try again with a  larger number");
            } else{
            System.out.println("Absolutely correct!");
            }
        } while(guess!=number);
       
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random random = new Random();

        // taking random no. from computer between 1 to 100
        int number = random.nextInt(100)+1;
        Guess(number,sc);
sc.close();
    }
}
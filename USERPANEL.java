import java.util.Scanner;
import java.util.InputMismatchException;

// it's what the user uses.
public class USERPANEL extends gameboard
{
    int[] guess = new int[4];
    String[] pegs = new String[4];
    private int[] solution = new int[4];
    Scanner scanner = new Scanner(System.in);
    public void EVENTLOOP() {
        codegen(solution);
        explaining();
        scanner.useDelimiter(",|\n");
        while (true){
            System.out.println("your guess? no spaces, just 4 numbers seperated by commas.");
            try{
                for(int scan = 0; 0<=4;scan++){
                  guess[scan] = scanner.nextInt();  
                }
            } catch (InputMismatchException error){
                System.out.println("enter correctly.");
                System.out.println("example: 4,3,2,5");
                scanner.next();
            }
            System.out.println("let's see the accuracy:");
            
        }
        
    }
    public static void main (String[] args) {
        USERPANEL userpanel = new USERPANEL();
        userpanel.EVENTLOOP();
    }
}
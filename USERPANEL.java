import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.concurrent.ThreadLocalRandom;

// it's what the user uses.
public class USERPANEL extends gameboard
{
    int[] guess = new int[4];
    
    private int[] solution = new int[4];
    Scanner scanner = new Scanner(System.in);
    boolean CONTINUE = true;
    int DIDIT = 0;
    int TRIES = 0;
    public void EVENTLOOP() {
        codegen(solution);
        explaining();
        scanner.useDelimiter(",|\n");
        while (CONTINUE==true){
            System.out.println("your guess? no spaces, just 4 numbers seperated by commas. numbers can repeat.");
            DIDIT = 0;
            String[] pegs = new String[4];
            try{
                for(int scan = 0; scan<=3;scan++){
                    guess[scan] = scanner.nextInt();
                        if(((String.valueOf(guess[scan]).length())>1)||(guess[scan]>3)){
                        System.out.println("nope. try again.");
                        System.out.println("remember: commas. single digits, from 0-3.");
                        scanner.next();
                    }
                }
                
                System.out.println("let's see the accuracy:");
                accuracy(guess,solution,pegs);
                System.out.println(pegs[0]+pegs[1]+pegs[2]+pegs[3]);
                TRIES++;
                for (int g = 0; g<=3; g++){
                    if (pegs[g].equals("yep, ")){
                        DIDIT++;
                    }
                }
                if(DIDIT==4){
                    System.out.println("You did it! all it took was "+TRIES+" attempts.");
                    System.out.println("goodbye.");
                    CONTINUE= false;
                }
            } catch (InputMismatchException error){
                System.out.println("enter correctly.");
                System.out.println("example: 4,3,2,5");
                scanner.next();
            }
            
        }

    }

    public static void main (String[] args) {
        USERPANEL userpanel = new USERPANEL();
        userpanel.EVENTLOOP();
    }
}
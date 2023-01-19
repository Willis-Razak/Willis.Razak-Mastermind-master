//computer who does logic
import java.util.concurrent.ThreadLocalRandom;
public class gameboard
{
    public int[] codegen(int[] code){
        for(int i=0;i<=3; i++){
            code[i]= ThreadLocalRandom.current().nextInt(0,4);
        }
        return code;
    }

    public void explaining() {
        System.out.println("welcome to this janky mess of a project.");
        System.out.println("an attempt to explain the rules of mastermind:");
        System.out.println("you want to guess my code of 4 numbers, each number being from  0-3.");
        System.out.println("like a padlock. each space can be from 0-3, and numbers can repeat.");
        System.out.println("you have an unlimited amount of guesses,but a limited amount of info from guesses.");
        System.out.println("i'll tell you if a correct number is in the right place, or if it's a correct number in the wrong place.");
        System.out.println("good luck.");
        System.out.println("");
    }

    public void accuracy(int[] guess, int[] real, String[] pegs){
        boolean[] taken = new boolean[4];
        for(int g = 0; g<=3; g++){
            taken[g] = false;
        }
        for(int step=0; step<=3; step++){
            if ((guess[step])==(real[step])&&(taken[step]==false)){
                taken[step]=true;   
                pegs[step]=("yep, ");
            } else{
                for (int i=0; i<=3; i++){
                    if ((guess[step]==real[i])&&(taken[i]==false)&&(pegs[i]!=("yep, "))){
                        pegs[step]=("close, ");
                    }
                }
            }
        }
        for(int g=0; g<=3; g++){
                if(((taken[g]==false)||(pegs[g]==null))&&(pegs[g]!=("close, "))){
                    pegs[g]=("no, ");
                }
        }
    }
}

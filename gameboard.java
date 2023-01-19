//computer who does logic
public class gameboard
{
    public int[] codegen(int[] code){
        for(int i=0;i<=3; i++){
            code[i]= (int)(Math.random()*6);
        }
        return code;
    }
    public void explaining() {
        System.out.println("welcome to this janky mess of a project.");
        System.out.println("an attempt to explain the rules of mastermind:");
        System.out.println("you want to guess my code of 4 numbers, from 1-6.");
        System.out.println("you have a limited amount of guesses, and a limited amount of info from guesses.");
        System.out.println("i'll tell you if a correct number is in the right place, or if it's a correct number in the wrong place.");
        System.out.println("good luck.");
        System.out.println("");
    }
    public void accuracy(int[] guess, int[] real ){
        System.out.println("");
        int f=0;
        boolean[] taken = new boolean[4];
        for(int step=0; step<=3; step++){
            if (guess[step] == real[step]){
                taken[step]=true;
                System.out.print("yep, ");
            } else {
                for (int i=0; i<guess.length; i++){
                    if (guess[i] ==real[f]&&taken[i]==false){
                      System.out.print("close, ");  
                      f++;
                    }
                }
            }
        }
    }
}

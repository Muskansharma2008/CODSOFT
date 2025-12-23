import java.util.Random;
import java.util.Scanner;

public class NumberGaming {
    public static void main(String[] args) {
        boolean playagain=true;
        int score=0;
        Scanner sc=new Scanner(System.in);
        Random random= new Random();
        while(playagain) {
            int numbertoguess=random.nextInt(50)+1;
            int maxattempts=3;
            boolean isGuessed=false;
            System.out.println("Guess a number between 1 to 50: ");
            System.out.println("You have "+ maxattempts + "attempts.");
            for(int attempt=1;attempt<=maxattempts;attempt++) {
                System.out.println("Attempt "+ attempt +"Enter your guess: ");
                int guess=sc.nextInt();
                if(guess==numbertoguess) {
                    System.out.println("Correct!!");
                    score++;
                    isGuessed=true;
                    break;
                }
                else if(guess>=numbertoguess) {
                    System.out.println("Too high.");
                }
                else {
                    System.out.println("Too low.");
                }
            }
            if(!isGuessed) {
                System.out.println("Lost. The number was: "+ numbertoguess);
            }
            System.out.println("Do you want to continue?? (Y/N)");
            String choice=sc.next();
            if(choice=="Y" || choice=="y") {
                playagain=true;
            }
            System.out.println("****GAME OVER!****");
            System.out.println("Your score is "+ score);
        }
        sc.close();
    }
}

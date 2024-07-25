import java.util.Random;
import java.util.Scanner;

class Player{
    int numGuess;
    public  void guessNumber(){
        System.out.println("player guess the number");
        Scanner sc=new Scanner(System.in);
        numGuess=sc.nextInt();
    }
}
class gusser{
    int numGuess;
    public  void guessNumber(){
        System.out.println("Gusser guess the number");
        Scanner sc=new Scanner(System.in);
        numGuess=sc.nextInt();
    }
}

class Umpire {

    gusser guesser;
    Player p1, p2, p3;

    public void getNumberFromGuesser() {
        guesser = new gusser();
        guesser.guessNumber();
    }

    public void collectFromPlayers() {

        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        p1.guessNumber();
        p2.guessNumber();
        p3.guessNumber();
    }

    public void calcResult() {
        System.out.println(guesser.numGuess + " " + p1.numGuess + " " + p2.numGuess + " " + p3.numGuess);
        if (guesser.numGuess == p1.numGuess) {
            if (guesser.numGuess == p2.numGuess && guesser.numGuess == p3.numGuess)
                System.out.println("All are winners");
            else if (guesser.numGuess == p2.numGuess)
                System.out.println("Player 1 and 2 are the winners");
            else if (guesser.numGuess == p3.numGuess)
                System.out.println("Player 1 and 3 are the winners");
            else
                System.out.println("Player 1 is the winner");

        } else if (guesser.numGuess == p2.numGuess) {
            if (guesser.numGuess == p3.numGuess)
                System.out.println("Player 2 and 3 are the winners");
            else
                System.out.println("Player 2 is the winner");
        } else if (guesser.numGuess == p3.numGuess) {
            System.out.println("Player 3 is the winner");
        } else {
            System.out.println("Losers");
        }
    }
}

class LaunchGame {

    public static void main(String[] args) {

        Umpire sahil = new Umpire();
        sahil.getNumberFromGuesser();
        sahil.collectFromPlayers();
        sahil.calcResult();
    }
}

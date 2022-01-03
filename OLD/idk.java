package OLD;

import java.util.*;
public class method{
    static void randomGuess() {
        System.out.println("this is a guess number game you have to guess the random last two digit decimal that your friend give you, you have unlimited trys");
        System.out.println("put input number here");
        Scanner inputNum = new Scanner (System.in);
        double b=inputNum.nextDouble();
        System.out.println("put your guess number here");
        Scanner guessing = new Scanner(System.in);

        while(true) {
            double a = guessing.nextDouble();
            if (a == b) {
                System.out.println("good job");
                break;
            } else if (a < b) {
                System.out.println("too small");
            } else if (a > b) {
                System.out.println("too big");
            }
            System.out.println("put your other guess here");
        }
    }
    static void guessWordGame(){
        System.out.println("this is a word guessing game and you friend will give the computer a word and you have unlimited chance to guess the word");
        System.out.println("put input number in here");
        Scanner input=new Scanner(System.in);
        String inputWord=input.nextLine();
        while(true){
            System.out.println("put the guessed word here");
            Scanner guess=new Scanner(System.in);
            String guessWord=guess.nextLine();
            if(guessWord.equals(inputWord)){
                System.out.println("good job");
                break;
            }else if(guessWord.length()<inputWord.length()){
                System.out.println("the word is too short");
            }else if(guessWord.length()>inputWord.length()){
                System.out.println("the word is too long");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("put the number here to chose the game that your are going to play with you are going to play with your friends. 1 is guess number game,2 is guess word game.");
        Scanner chose=new Scanner(System.in);
        int choseNum=chose.nextInt();
        if(choseNum==1){
            randomGuess();
        }else if(choseNum==2){
            guessWordGame();
        }else{
            System.out.println("please enter 1 or 2 to play the two games");
        }
    }
}

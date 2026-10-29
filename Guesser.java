import java.util.*;

public class Guesser
{
  static String errorMessage = "Invalid Input.\nPlease try again.";
  
  public static void main(String[] args) {
    System.out.println("Welcome to the Guesser!");
    menu();
    System.out.println("Thank you for playing!");
  } // end main
	
  public static void menu(){
    Scanner userInterface = new Scanner(System.in);
    boolean keepGoing = true;
    String menuText = "0) Exit\n1) Human Guesser\n2) Computer Guesser\n\nPlease enter 0-2: ";
    while(keepGoing){
      System.out.print(menuText);
      int input = userInterface.nextInt();
      if(input == 0){
        keepGoing = false;
      } // end if
      else if(input == 1){
        humanGuesser();
      } // end else if
      else if(input == 2){
        computerGuesser();
      } // end else if
      else{
        System.out.println(errorMessage);
      } // end else
    } // end while
  } // end menu
  
  public static void humanGuesser() {
    Scanner userInterface = new Scanner(System.in);
    int correctAnswer = (int)((Math.random() * 100) + 1);
    int i = 1;
    boolean keepGoing = true;

    // System.out.println(correctAnswer);
    
    while(keepGoing){
      System.out.print(i + ") Please enter a number: ");
      int input = userInterface.nextInt();
      if(input < correctAnswer){
        System.out.println(input + " is too low");
        i++;
      } // end if
      else if(input > correctAnswer){
        System.out.println(input + " is too high");
        i++;
      } // end else if
      else if(input == correctAnswer){
        System.out.println("You got it! I was thinking of " + correctAnswer + "!\n");
        keepGoing = false;
      } // end else if
    } // end while 
  } // end humanGuesser
  
  public static void computerGuesser() {
    Scanner userInterface = new Scanner(System.in);
    String answerPrompt = "Too (H)igh, too (L)ow, or (C)orrect? ";
    int higherBound = 100;
    int lowerBound = 0;
    int currentGuess = 50;
    int i = 1;
    boolean keepGoing = true;
    
    while(keepGoing){
      currentGuess = ((higherBound+lowerBound) / 2);
      System.out.println(i + ") I guess " + currentGuess);
      System.out.print(answerPrompt);
      String userInput = userInterface.nextLine();
      userInput = userInput.toUpperCase();
      char input = userInput.charAt(0);
      if(input == 'H'){
        //System.out.println("Higher Selected");
        higherBound = currentGuess;
        i++;
      } // end if
      else if(input == 'L'){
        //System.out.println("Lower Selected");
        lowerBound = currentGuess;
        i++;
      } // end else if
      else if(input == 'C'){
        keepGoing = false;
      } // end else if
      else{
        System.out.println(errorMessage);
      } // end else */
    } // end while 
  } // end computerGuesser
} // end Guesser

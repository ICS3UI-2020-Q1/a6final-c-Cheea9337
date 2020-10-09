import java.util.Scanner;
/**
 * helps with cheating in blackjack
 * @author Aidan Cheesmond
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    int[] cards = new int[5];

    // asks the user for five card values
    System.out.println("Please enter the value of 5 cards:");

    // create a for loop to get the user's card values
    for(int i = 0; i < cards.length; i++){
      cards[i] = input.nextInt();
    }

    // create a variable for the count
    int count = 0;
    // use another for loop to count the cards
    for(int i = 0; i < cards.length; i++){
      if(cards[i] <= 6){
        count = count + 1;
      } else if(cards[i] >= 11){
        count = count - 1;
      } else {
        
      }
    }
    
    // tell the user the count
    System.out.println("The count would be " + count);

  }
}

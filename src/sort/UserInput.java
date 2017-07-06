package sort;

import java.util.List;
import java.util.Scanner;


/**
 * @author HwangC
 * @version 1.0
 */
public class UserInput {

  protected static void getUserInput(List<Object> lBubble, int numOfInput) {

    Scanner userInput = null;

    try {

      // Let people input the numbers
      userInput = new Scanner(System.in);

      System.out.println("Enter " + numOfInput + " random numbers: ");

      int i = 0;

      while (i < numOfInput) {
        lBubble.add(userInput.next());
        i++;
      }
      
      BubbleSort.printArr(lBubble);

    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      userInput.close();
    }

    return;

  }
}

package sort;

import java.util.List;
import java.util.Scanner;

/**
 * Bubble sort, sometimes referred to as sinking sort, is a simple sorting algorithm that
 * repeatedly steps through the list to be sorted, compares each pair of adjacent items and
 * swaps them if they are in the wrong order. Passes through the list are repeated until no
 * swaps are needed, which indicates that the list is sorted. The algorithm, which is a comparison
 * sort, is named for the way smaller or larger elements "bubble" to the top of the list.
 * Although the algorithm is simple, it is too slow and impractical for most problems even when
 * compared to insertion sort. It can be practical if the input is usually in sorted order but
 * may occasionally have some out-of-order elements nearly in position.
 *
 * source - https://en.wikipedia.org/wiki/Bubble_sort
 */

/**
 * @author HwangC
 * @version 1.0
 */
public class UserInput {

  private static void getUserInput(List<Object> lBubble, int numOfInput) {

    Scanner userInput = null;

    try {

      // Let people input the numbers
      userInput = new Scanner(System.in);

      System.out.println("Enter " + numOfInput + " random numbers: ");

      int i = 0;

      while (i < 10) {
        lBubble.add(userInput.next());
        i++;
      }

    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      userInput.close();
    }

    return;

  }
}

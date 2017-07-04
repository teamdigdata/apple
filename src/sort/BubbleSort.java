package sort;

import java.util.ArrayList;
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
public class BubbleSort {

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

	public static void main(String[] args) {

		int numOfInput = 10;
		List<Object> lBubble = null;

		try {
			/*
			 * Initial numbers in array
			 */

			// What is the initial array?
			// It takes all types of numbers
			lBubble = new ArrayList<Object>();
			getUserInput(lBubble, numOfInput);
			// Iterator<Object> iBubble = lBubble.iterator();
			// iBubble.forEachRemaining(System.out::println);
			// or
			// Generate random numbers

			// What is the size of the array?

			// Does it set the max and min of the array?
			/*
			 * Start the bubble sort process
			 */

			// What is the current comparison index?

			// What is the result after the BubbleSort?

			/*
			 * Analyze the bubble sort performance
			 */

			// How many times does it process the comparison?

			/*
			 * Exceptional cases
			 */

			// What are the exceptional cases?

			// How to deal with them?

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package sort;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import sort.UserInput;
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

public class BubbleSort {

  private static boolean isRand = false;
  private static int numOfInput = 5;
  static List<Object> lBubble = null;

  public static void main(String[] args) {
    /*
     * It is me
     * @author DongHoon
     * @since 2017. 06.30
     * 
     * Bubble Sort
     */

    // start
    System.out.println("\n=================================");
    System.out.println("\t Bubble Sort Start");
    System.out.println("=================================");
    
    if(isRand) {
      int [] arr = new int [10]; 
      inputNum(arr);
      sortArr(arr);
    } else {
      lBubble = new ArrayList<Object>();
      UserInput.getUserInput(lBubble, numOfInput);
      //Iterator<Object> iBubble = lBubble.iterator();
      //iBubble.forEachRemaining(System.out::println);
      sortArr(lBubble);
    }


    System.out.println("=================================");
    System.out.println("\t Bubble Sort End");
    System.out.println("=================================");		

    // What is the initial array?
    // It takes all types of numbers
    //lBubble = new ArrayList<Object>();
    //getUserInput(lBubble, numOfInput);
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
  }

  /*
   * Insert random number in array
   */
  static void inputNum(int arr[]){
    Random rand = new Random();
    int temp; 
    boolean flag = false;
    int i=0;
    while(i<10){
      temp = rand.nextInt(10);

      for(int j=0; j<i; j++){
        if(temp == arr[j]){
          flag = true;
          break;
        }
      }

      if(flag == true){
        flag = false;
        continue;
      }

      arr[i] = temp;
      i++;
    }	
  }

  /*
   * Sort random number in array
   */
  static void sortArr(int arr[]){
    int temp=0;
    int i=0;
    while(i<arr.length-1)
    {
      for(int j=0; j<arr.length-1; j++)
      {
        if(arr[j]>arr[j+1])
        {
          temp=arr[j+1];
          arr[j+1]=arr[j];
          arr[j]=temp;		
        }		
      }
      i++;
      printArr(arr);
    }
  }
  
  /*
   * Sort random number in array
   */
  static void sortArr(List<Object> lBubble){

    int i=0;
    int bubbleSize = lBubble.size();
    Object temp=null;

    while(i<bubbleSize-1)
    {
      int changeTime = 0;

      for(int j=0; j<bubbleSize-(1+i); j++)
      {
        double curNum = Double.parseDouble((String) lBubble.get(j));
        double nextNum = Double.parseDouble((String) lBubble.get(j+1));

        if(curNum > nextNum)
        {
          //temp = String.valueOf(nextNum);
          temp = lBubble.get(j+1);
          lBubble.set(j+1,lBubble.get(j));
          lBubble.set(j,temp);
          changeTime++;
        }
      }

      i++;
      printArr(lBubble);

      if(changeTime == 0) {
        break;
      }
    }
  }

  /*
   * Print array
   */
  static void printArr(int arr[])
  {
    for(int i=0; i<arr.length; i++)
      System.out.print(arr[i]+"  ");
    System.out.println();
  }

  static void printArr(List<Object> lBubble)
  {
    for(int i=0; i<lBubble.size(); i++)
      System.out.print(lBubble.get(i)+"  ");
    System.out.println();
  }
}

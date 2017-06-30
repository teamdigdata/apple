package sort;

import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * It is me
		 * @author GwangMo
		 * @since 2017.06.22
		 */

		System.out.println("I am GM");
		System.out.println("I am Hwang");

	
		/*
		 * It is me
		 * @author DongHoon
		 * @since 2017. 06.30
		 */

		System.out.println("I am DH");
		System.out.println("I am Lee");
		
		/*
		 * It is me
		 * @author DongHoon
		 * @since 2017. 06.30
		 * 
		 * Eclipse Test
		 */
		
		System.out.println("Eclipse Test");
		
		/*
		 * It is me
		 * @author DongHoon
		 * @since 2017. 06.30
		 * 
		 * Bubble Sort
		 */
		
		// 배열 생성
		System.out.println("\n=================================");
		System.out.println("\t Bubble Sort Start");
		System.out.println("=================================");
		
		int [] arr = new int [10]; 
		inputNum(arr);
		sortArr(arr);
		
		System.out.println("=================================");
		System.out.println("\t Bubble Sort End");
		System.out.println("=================================");		
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
	 * Print array
	 */
	static void printArr(int arr[])
	{
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]+"  ");
		System.out.println();
	}
	
}

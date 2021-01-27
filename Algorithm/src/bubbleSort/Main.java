package bubbleSort;

public class Main {

	 static void bubbleSort(int arr [], int size) {
		
		for(int x = 0; x < size - 1; x++) {
			for(int j = 0; j < size - 1 - x; j ++)
				if(arr[j] > arr[j + 1]) {
					int swap = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = swap;
				}
		}
	}
	
	static void printArr(int arr [], int size) {
		for(int x = 0; x < size -1; x ++) {
			System.out.println(arr[x] + " ");
		}
	}
	
	public static void main(String [] args) {
	
		int arr [] = {64, 34, 25, 12, 22, 11, 90}; 
		int size = arr.length;
		
		//Main m = new Main(); in case that functions not defined as statics. 
		
		bubbleSort(arr, size);
		printArr(arr, size);
		
	}
}

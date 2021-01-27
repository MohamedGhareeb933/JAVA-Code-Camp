package selectionSort;

public class Main {
	
	static void selectionSort(int arr [], int size) {
		
		for (int x = 0; x < size -1; x++) {
			
			int min = x;
			
			for(int j = x+ 1; j < size; j++) {
				
				if(arr[j] < arr[min]) {
					
					min = j;
				}
			}
			
			
			int swap = arr[x];
			arr[x] = arr[min];
			arr[min] = swap;
			
		}
	}
	
	static void printArr(int arr[], int size) {
		for(int x  = 0; x < size; x++) {
			System.out.println(arr[x]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 64, 25, 12, 22, 11 };
		int size = arr.length;
		
		selectionSort(arr, size);
		printArr(arr, size);
	}

}

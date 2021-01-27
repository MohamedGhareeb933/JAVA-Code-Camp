package insertionSort;

public class Main {
	
	public static void insertion(int arr[], int size) {
		for(int i = 1; i < size; i++ ) {
			
			int key = arr[i]; // 1
			int j = i - 1; // 0
			
			while(j >= 0 && arr[j] > key) { // 0 > 1
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}
	
	public static void printArray(int arr[], int size) {
		for(int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int arr[] = { 12, 11, 13, 5, 6 };  
	    int size = arr.length;
	    insertion(arr, size);
	    printArray(arr, size);

	}

}

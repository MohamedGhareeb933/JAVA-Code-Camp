package Algorithm;

public class Main {
    public static int partition(int arr[], int low, int high) {
        int pivot  = arr[high];
        int j = low - 1;

        for (int i = low; i < high; i++) {
            if( arr[i] < pivot) {
                j++;
                int swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
            }
        }

        int swap = arr[j + 1];
        arr[j + 1] = arr[high];
        arr[high] = swap;

        return (j + 1);
    }

    public static void quickSort(int arr[], int low, int high) {

        if (low < high) {
            int pr = partition(arr, low , high);

            quickSort(arr, low , pr - 1);
            quickSort(arr, pr + 1 ,high);
        }


    }

    public static void printArray(int arr[], int size) {

        for (int i = 0; i < size; i ++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String [] args) {
        int arr[] = {15, 57, 489, 34, 25, 148, 6};
        int size = arr.length;
        quickSort(arr, 0, size - 1);
        printArray(arr, size);
    }
}

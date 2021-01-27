package MegreSort;

public class Main {
    
    public static void merge(int arr[], int l, int m, int r) {

        int i, j, k;
        int le = m - l + 1;
        int re = r - m;

        int leftArray[] = new int[le];
        int rightArray[] = new int[re];

        for (i = 0; i < le; i++) {
            leftArray[i] = arr[i + l];
        }
        for (j = 0; j < re; j++) {
            rightArray[j] = arr[m + j + 1];
        }

        i = 0;
        j = 0;
        k = l;

        while (i < le && j < re) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < le) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while(j < re) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int arr[], int l, int r) {

        if (l < r) {
            int m = (l + r) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m +1, r);
            merge(arr, l, m, r);

        }
    }

    public static void printArray(int arr[], int size) {

        for (int i = 0;  i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String [] args) {
        int arr[] = {15, 67, 54, 256, 57, 62, 547, 563, 486};
        int size = arr.length;

        mergeSort(arr, 0, size - 1);
        printArray(arr, size);

    }
}

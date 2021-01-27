package algorithm;

public class main {

    int binarySearch(int arr[], int l, int r, int element) {

        if (l <= r) {
            int mid = l +(r - 1) /2;

            if (arr[mid] == element) return mid;

            if (arr[mid] > element)
                return binarySearch(arr, l, mid - 1, element);
            else
                return binarySearch(arr, mid + 1, r , element);
        }

        return -1;
    }
    public static void main(String [] args) {

        main m = new main();

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int size = arr.length;

        int result = m.binarySearch(arr, 0, size - 1, 7);

        System.out.println("element found at index " + result);

    }
}

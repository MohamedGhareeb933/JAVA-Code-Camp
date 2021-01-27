package Algorithm;

public class main {

    int search(int arr[], int size, int element) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == element) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String [] args) {
        main m = new main();

        int arr[] = { 78, 67, 31, 2, 79, 37, 285, 41};
        int size = arr.length;

        System.out.println("fount element at index: " + (m.search(arr, size, 79) + 1) );
    }
}

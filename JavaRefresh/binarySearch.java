package JavaRefresh;

public class binarySearch {

    public static int searching(int a[], int t, int l, int h) {
        int med = (l + h ) /  2;
        int finalResult = 0;

        if (t == a[med]) {
            return med;
        }else {

            if (t > a[med] && med <= h){
                //  go right
                med = searching(a, t, med + 1, h);
            }

            if (t < a[med] && l <= med) {
                // go left
                med = searching(a, t, l, med);
            }
            return med;
        }
    }

    public static void main(String [] args) {
        int array[] = {1, 5, 7, 8, 9, 11, 18, 19, 20, 25};
        int Target = 11;
        int size = array.length;

         System.out.println(searching(array, Target, 0, size - 1));
    }
}

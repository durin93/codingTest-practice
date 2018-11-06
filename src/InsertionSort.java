public class InsertionSort {


    public static int[] insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int selection = arr[i];
            int compareLast = i - 1;

            while (compareLast>=0 && selection < arr[compareLast]) {
                arr[compareLast+1] = arr[compareLast];
                compareLast--;
            }

            arr[compareLast+1] = selection;

        }


        return arr;
    }

}

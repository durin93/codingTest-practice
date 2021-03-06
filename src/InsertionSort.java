public class InsertionSort {

    //[승철] [오후 4:47] 기준값을 정하고
    //[승철] [오후 4:47] 기준값보다 크면 밀어내고 기준값은 그자리에 삽입해주는
    //[승철] [오후 4:47] 정렬방법입니다

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

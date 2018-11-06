public class SelectionSort {

    /*선택정렬이란
    최솟값을 구하고 그것을 맨앞자리에 넣어줌을 반복하는 정렬입니다. 이것도 시간복잡도는 n^2이군요
    */
    public static int[] selectSortAsc(int[] items) {


        int min;

        for (int i = 0; i < items.length - 1; i++) {
            min = i;

            for (int j = i + 1; j < items.length; j++) {
                if (items[min] > items[j]) {
                    min = j;
                }
            }

            if (min != i) {
                int temp = items[min];
                items[min] = items[i];
                items[i] = temp;
            }
        }

        return items;
    }


    public static int[] selectSortDesc(int[] items) {

        int indexMin;

        for (int i = 0; i < items.length - 1; i++) {
            indexMin = i;
            for (int j = i + 1; j < items.length; j++) {
                if (items[indexMin] < items[j]) {
                    indexMin = j;
                }
            }

            int temp = items[indexMin];
            items[indexMin] = items[i];
            items[i] = temp;


        }

        return items;
    }

}

public class SelectionSort {

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

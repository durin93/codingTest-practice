public class BubbleSort {


    public static int[] bubbleSortAsc(int[] items) {

        for (int i = 0; i < items.length - 1; i++) {
            for (int j = 0; j < items.length - 1; j++) {
                if (items[j] > items[j + 1]) {
                    int temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;

                }
            }

        }

        return items;
    }

    public static int[] bubbleSortDesc(int[] items) {

        for(int i = 0; i < items.length-1; i++){
            for(int j = 0; j < items.length-1; j++){
                if(items[j]<items[j+1]) {
                    int temp = items[j];
                    items[j] = items[j+1];
                    items[j+1] = temp;
                }
            }
        }

        return items;
    }

}

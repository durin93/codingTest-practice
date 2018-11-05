public class QuickSort {

    public static int[] quickSort(int[] items, int left, int right) {

        if(left<right) {
            int partionIndex = partition(items, left, right);

            quickSort(items, left, partionIndex - 1);
            quickSort(items, partionIndex + 1, right);
        }
        return items;
    }

    public static int partition(int[] items, int left, int right){


        int pivotValue = items[(left+right)/2];


        while(left < right){

            while(items[left] < pivotValue && left< right)
                left++;

            while(items[right] > pivotValue && left< right)
                right--;

            if(left<right){
                int temp = items[left];
                items[left] = items[right];
                items[right] = temp;
            }

        }


        return left;
    }

}

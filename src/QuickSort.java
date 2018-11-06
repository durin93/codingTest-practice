public class QuickSort {

   public static int[] quickSort(int[] arr, int left, int right){

       if(left < right){

           int pivotIndex = partition(arr, left, right);

           quickSort(arr, left, pivotIndex-1);
           quickSort(arr, pivotIndex+1, right);

       }


       return arr;
   }

   public static int partition(int[] arr, int left, int right){

       int pivotNum = arr[(left+right)/2];

       while(left < right){
           while(arr[left] < pivotNum && left < right)
               left++;

           while(arr[right] > pivotNum && left < right)
               right--;


           if(left < right){
               int temp = arr[left];
               arr[left] = arr[right];
               arr[right] = temp;
           }



       }

       return left;
   }


}

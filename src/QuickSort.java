public class QuickSort {

    //

   public static int[] quickSort(int[] arr, int left, int right){


       if(left < right){
           int pivotNum = partition(arr, left, right);
           quickSort(arr, left, pivotNum-1);
           quickSort(arr, pivotNum+1, right);

       }
       return arr;
   }

   public static int partition(int[] arr, int left, int right){

     int pivot = arr[(left+right)/2];

     while(left<right){

         while(arr[left] < pivot && left<right)
            left++;
         while(arr[right] > pivot && left<right)
            right--;

         if(left<right){
             int temp = arr[left];
             arr[left] = arr[right];
             arr[right] = temp;
         }


     }


       return left;
   }


}

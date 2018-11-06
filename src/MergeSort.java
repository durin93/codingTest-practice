public class MergeSort {

    public static void mergeSort(int[] arr,int start, int end){
        int[] temp = new int[arr.length];

        if(start<end){
            int mid = (start+end)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,temp,start,mid,end);
        }
    }

    public static void mergeSort2(int[] arr, int start, int end){

        int[] temp = new int[arr.length];

        if(start<end){
            int mid = (start+end)/2;
            mergeSort2(arr, start, mid);
            mergeSort2(arr, mid+1, end);
            merge2(arr,temp,start, mid ,end);
        }

    }

    public static void merge2(int[] arr, int[] temp, int start, int mid, int end){

        for(int i = 0; i < temp.length; i++){
            temp[i] = arr[i];
        }

        int part1 = start;
        int part2 = mid+1;
        int index = start;

        while(part1 <= mid && part2 <= end){

            if(temp[part1] < temp[part2]){
                arr[index] = temp[part1];
                part1++;
            }else{
                arr[index] = temp[part2];
                part2++;
            }
            index++;
        }

        for(int i = 0; i < mid-part1; i++){
            arr[index+i] = temp[part1+i];
        }


    }





    public static void merge(int[] arr, int[] temp, int start, int mid, int end){

        for(int i = start; i <= end; i++){
            temp[i] = arr[i];
        }

        int part1 = start;
        int part2 = mid+1;
        int index = start;

        while(part1 <= mid && part2 <= end){//첫배열이끝까지가거나 둘배열이 끝까지갈ㄸ까지
            if(temp[part1] <= temp[part2]){ //두개의 배열방의 첫번째값부터 비교해서 앞이 작으면 앞에걸 옮기고 앞족포인터이동
                arr[index] = temp[part1];
                part1++;
            }
            else{ //그게아니면 뒤쪽걸옮기고 뒤쪽포이터이동
                arr[index] = temp[part2];
                part2++;
            }
            index++;
        }
        //둘중 하나가 끝날떄까지돌림

        //만약 뒤쪽배열이 비엇는데 앞쪽이 남아있는경우를 대비해서
        //앞쪽 포인터가 배열의 끝에서 남은만큼 최종적으로 저장할배열에 붙여준다.
        for(int i = 0; i<= mid - part1; i++){
            arr[index + i ] = temp[part1 + i];
        }

    }

}

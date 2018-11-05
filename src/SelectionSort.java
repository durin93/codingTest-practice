public class SelectionSort {

    public static int[] selectSortAsc(int [] items){

        int indexMin;

        for(int i=0; i < items.length-1; i++){
            indexMin = i;
            for(int j = i+1; j<items.length; j++){
                if(items[indexMin] > items[j]){
                    indexMin = j;
                }
            }

            int temp = items[indexMin];
            items[indexMin] = items[i];
            items[i]=temp;


        }

        return items;
    }


    public static int[] selectSortDesc(int [] items){

        int indexMin;

        for(int i=0; i < items.length-1; i++){
            indexMin = i;
            for(int j = i+1; j<items.length; j++){
                if(items[indexMin] < items[j]){
                    indexMin = j;
                }
            }

            int temp = items[indexMin];
            items[indexMin] = items[i];
            items[i]=temp;


        }

        return items;
    }

}

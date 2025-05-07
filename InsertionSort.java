public class InsertionSort {
    
    public static void insertionSort(int[]arr){
        int temp;
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j>0 && arr[j-1] > arr[j]) {
                temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                --j;
            }
        }
    }
}

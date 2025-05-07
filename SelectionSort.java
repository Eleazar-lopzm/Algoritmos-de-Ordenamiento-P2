public class SelectionSort {

  public static void selectionSort(int[] arr){
    
    int min;
    int temp;

    // Recorrer el arreglo de principio a fin
    for (int i = 0; i < arr.length; i++) {
      min = i;
      for (int j = i+1; j < arr.length; j++) {
        if(arr[min]>arr[j]){
          min = j;
        }
      } 
      
    temp = arr[i];
     arr [i] = arr[min];
      arr[min] = temp;

    }

  }
  
}

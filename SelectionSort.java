import static Utilidades.Print.print;
import static Utilidades.Swap.swap;

public class SelectionSort {

  public static void selectionSort(int[] arr) {

    int min;

    // Recorrer el arreglo de principio a fin
    for (int i = 0; i < arr.length; i++) {
      min = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[min] > arr[j]) {
          min = j;
        }
      }
      swap(arr, i, min);
    }

  }

}

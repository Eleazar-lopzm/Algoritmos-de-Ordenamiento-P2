import static Utilidades.Swap.swap;

public class SelectionSort {
  /**
   * Ordena un arreglo usando el algoritmo Selection Sort
   * 
   * @param arr Arreglo de enteros a ordenar (se modifica directamente)
   */
  public static void selectionSort(int[] arr) {

    int min;

    // Recorrer el arreglo de principio a fin, buscando el minimo
    for (int i = 0; i < arr.length; i++) {
      min = i;
      System.out.println("\nIteración " + (i + 1) + ": Buscando mínimo desde posición " + i);
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[min] > arr[j]) {
          min = j;
        }
      }
      System.out.println("  Intercambio: " + arr[i] + " ↔ " + arr[min]);
      swap(arr, i, min);
    }

  }

}

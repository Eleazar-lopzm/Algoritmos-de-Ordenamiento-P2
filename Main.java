import static Utilidades.Print.print;

public class Main {
  // Textos para mostrar en consola
  public static String original = "Arreglo original:";
  public static String ordenado = "Arreglo ordenado:";

  // Constantes para identificar los algoritmos:
  static final String selection = "-------------------------- \n SelectionSort \n--------------------------";
  static final String insertion = "-------------------------- \n InsertionSort \n--------------------------";
  static final String quick = "-------------------------- \n QuickSort \n--------------------------";
  static final String heap = "-------------------------- \n HeapSort \n--------------------------";
  static final String merge = "-------------------------- \n MergeSort \n--------------------------";

  /**
   * Crea una copia independiente de un arreglo de enteros.
   * 
   * @param arr Arreglo original a copiar.
   * @return Nuevo arreglo con los mismos elementos que el original.
   */
  public static int[] copiaArreglo(int[] arr) {
    int longitud = arr.length;
    int[] arr2 = new int[longitud];
    System.arraycopy(arr, 0, arr2, 0, longitud);
    return arr2;
  }

  /**
   * Ejecuta y muestra el resultado de un algoritmo de ordenamiento.
   * 
   * @param arr       Arreglo original a ordenar
   * @param algoritmo Constante que identifica el algoritmo a usar (selection,
   *                  insertion, etc.).
   */
  public static void procedimiento(int[] arr, String algoritmo) {
    // hacemos una copia del algoritmo a ordenar
    int[] copia = copiaArreglo(arr);
    // Imprimimos que algoritmo vamos a usar:
    System.out.println(algoritmo);

    // Imprimimos el arreglo original a usar:
    System.out.println(original);
    print(arr);

    // Medir tiempo antes de ejecutar el algoritmo
    long inicio = System.nanoTime(); // También puedes usar System.currentTimeMillis()

    // ordenamos dicho arreglo:
    switch (algoritmo) {
      case selection:
        SelectionSort.selectionSort(copia);
        break;
      case insertion:
        InsertionSort.insertionSort(copia);
        break;
      case quick:
        QuickSort.quickSort(copia, 0, copia.length - 1);
        break;
      case heap:
        HeapSort.heapSort(copia);
        break;
      case merge:
        copia = MergeSort.mergeSort(copia);
        break;
    }

    // Medir tiempo después de ejecutar el algoritmo
    long fin = System.nanoTime();
    long tiempoEjecucion = fin - inicio;

    // Salimos del switch para imprimir el resultado
    System.out.println(ordenado);
    print(copia);
    System.out.println("Tiempo de ejecución: " + tiempoEjecucion + " nanosegundos");
    System.out.println("Tiempo de ejecución: " + (tiempoEjecucion / 1_000_000.0) + " milisegundos");
    System.out.println("--------------------------");

    // vuelvo a desordenar
    copia = copiaArreglo(arr);
  }

  public static void main(String[] args) {
    int[] arr = { 13, 54, 14, 62, 32, 21, 27, 53, 40, 10 };

    // Selection Sort
    procedimiento(arr, selection);

    // InsertionSort
    procedimiento(arr, insertion);

    // QuickSort
    procedimiento(arr, quick);

    // HeapSort
    procedimiento(arr, heap);

    // MergeSort
    procedimiento(arr, merge);

  }
}

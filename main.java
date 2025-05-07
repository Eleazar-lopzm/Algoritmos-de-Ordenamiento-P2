public class main {
  public static String original = "Arreglo original:";
  public static String ordenado = "Arreglo ordenado:";

  static final String selection = "-------------------------- \n SelectionSort \n--------------------------";
  static final String insertion = "-------------------------- \n InsertionSort \n--------------------------";

  static final String quick = "-------------------------- \n QuickSort \n--------------------------";

  // Metodo que toma todos los elementos de un arreglo y los imprime
  public static void print(int[] arr) {
    System.out.print("[");
    for (int i = 0; i < arr.length; i++) {
      if (i > 0 && i < arr.length) {
        System.out.print(", ");
      }
      System.out.print(arr[i]);
    }
    System.out.println("]");
  }

  // Metodo que copia los elementos de un arreglo dado y devuelve la copia en un nuevo arreglo
  public static int[] copiaArreglo(int[] arr){
    int longitud = arr.length;
    int [] arr2 = new int[longitud];
    System.arraycopy(arr, 0, arr2, 0, longitud);
    return arr2;
  }

  // Metodo que toma dos arreglos el primero que copia al segundo y lo imprime para mostrar que si se desordenó
  public static void desordenarArreglo(int[]arr2, int[]arr){
        // Desordenamos el arreglo
        arr2 = copiaArreglo(arr);
        System.out.println("Volvemos a desordenar");
        print(arr2);
  }

  // Metodo que realiza el procedimiento de las pruebas con un arreglo y su algoritmo y lo muestra
  public static void procedimiento (int[]arr, String algoritmo){
    // hacemos una copia del algoritmo a ordenar
    int[] copia = copiaArreglo(arr);
    // Imprimimos que algoritmo vamos a usar:
    System.out.println(algoritmo);

    //Imprimimos el arreglo original a usar:
    System.out.println(original);
    print(arr);

    // ordenamos dicho arreglo: 
    switch (algoritmo) {
      case selection:
      SelectionSort.selectionSort(copia);
        break;
    
      default:
        break;
    }

    // Salimos del switch para imprimir el resultado
    System.out.println(ordenado);
    print(copia);

  }

  public static void main(String[] args) {
    int[] arr = { 13, 54, 14, 62, 32, 21, 27, 53, 40, 10 };
    int [] arr2 = copiaArreglo(arr);

    // //SelectionSort
    // System.out.println(selection);
    // // imprimir arreglo original
    // System.out.println(original);
    // print(arr);
    // SelectionSort.selectionSort(arr2);
    // // imprimir el arreglo ordenado
    // System.out.println(ordenado);
    // print(arr2);

    // // volvemos a desordenar el arreglo
    // desordenarArreglo(arr2, arr);

    //Selection Sort
    procedimiento(arr, selection);

    //InsertionSort
    System.out.println(insertion);
    // imprimir arreglo original
    System.out.println(original);
    print(arr);
    InsertionSort.insertionSort(arr2);
    // imprimir el arreglo ordenado
    System.out.println(ordenado);
    print(arr2);




  }
}

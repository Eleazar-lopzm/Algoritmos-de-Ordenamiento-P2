package Utilidades;
public class Swap {
    /** Intercambia dos elementos de un arreglo gracias a sus indices. */
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}

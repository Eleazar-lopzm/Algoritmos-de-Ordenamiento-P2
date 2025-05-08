package Utilidades;
public class Print {
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
}

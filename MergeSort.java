import static Utilidades.Print.print;
import static Utilidades.Swap.swap;

public class MergeSort {

    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mitad = arr.length / 2;
        int[] arregloizq = new int[mitad];
        int[] arregloder = new int[arr.length - mitad];

        /** Llenamos los arreglos: */
        for (int i = 0; i < mitad; i++) {
            arregloizq[i] = arr[i];
        }

        for (int i = mitad; i < arr.length; i++) {
            arregloder[i - mitad] = arr[i];
        }

        System.out.println("Dividiendo: ");
        print(arr);
        System.out.println("En: ");
        print(arregloder);
        print(arregloizq);

        int[] arregloizqordenado = mergeSort(arregloizq);
        int[] arrderordenado = mergeSort(arregloder);

        return merge(arregloizqordenado, arrderordenado);
    }

    public static int[] merge(int[] arregloizq, int[] arregloder) {
        int[] ordenado = new int[arregloder.length + arregloizq.length];
        // Para ir avanzando en el arreglo ordenado
        int k = 0;

        System.out.print("Mezclando ");
        print(arregloizq);
        System.out.print("con ");
        print(arregloder);
        System.out.println();

        while (arregloizq.length > 0 && arregloder.length > 0) {
            if (arregloizq[0] > arregloder[0]) {
                ordenado[k] = arregloder[0];
                arregloder = pop(arregloder);
            } else {
                ordenado[k] = arregloizq[0];
                arregloizq = pop(arregloizq);
            }
            k++;
        }

        while (arregloizq.length > 0) {
            ordenado[k++] = arregloizq[0];
            arregloizq = pop(arregloizq);
        }

        while (arregloder.length > 0) {
            ordenado[k++] = arregloder[0];
            arregloder = pop(arregloder);
        }

        return ordenado;
    }

    /** Metodo que elimina el primer elemento de un arreglo */
    public static int[] pop(int[] arr) {
        int[] copia = new int[arr.length - 1];

        for (int i = 0; i < copia.length; i++) {
            copia[i] = arr[i + 1];
        }
        return copia;
    }

}
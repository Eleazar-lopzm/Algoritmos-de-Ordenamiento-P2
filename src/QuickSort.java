package src;
import static Utilidades.Print.print;
import static Utilidades.Swap.swap;

public class QuickSort {
    /**
     * Particiona el arreglo alrededor de un pivote para QuickSort
     * 
     * @param arr Arreglo a particionar
     * @param ini Índice inicial del subarreglo
     * @param fin Índice final del subarreglo
     * @return Índice final de la posición del pivote
     */
    public static int particion(int[] arr, int ini, int fin) {
        // Sacamos la media del piso de el inicio + fin entre 2
        int indicepivote = (ini + fin) / 2;
        int pivote = arr[indicepivote];

        // Asignamos la media como pivote para la particiión.
        System.out.println("El nuevo pivote es:" + pivote + " con indice: " + indicepivote);

        int l = ini;
        int r = fin;

        System.out.println("L empieza en: " + l);
        System.out.println("R empieza en: " + r);

        /** Hacemos el ciclo para que mientras no se cruzen pare */
        while (l <= r) {
            while (arr[l] < pivote) {
                l++;
            }

            while (arr[r] > pivote) {
                r--;
            }

            if (l <= r) {
                swap(arr, l, r);
                System.out.println("Intercambiamos " + arr[l] + "," + arr[r]);
                print(arr);
                l++;
                r--;
            }

        }
        // Ajustamos el índice del pivote para que quede en su lugar
        if (indicepivote < r) {
            swap(arr, indicepivote, r);
            indicepivote = r;
        } else if (indicepivote > l) {
            swap(arr, indicepivote, l);
            indicepivote = l;
        }
        return indicepivote;
    }

    /**
     * Ordena un arreglo usando el algoritmo QuickSort
     * 
     * @param arr Arreglo a ordenar
     * @param ini Índice inicial del rango a ordenar
     * @param fin Índice final del rango a ordenar
     */
    public static void quickSort(int[] arr, int ini, int fin) {
        if (ini < fin) {
            int p = particion(arr, ini, fin);
            quickSort(arr, ini, p - 1);
            quickSort(arr, p + 1, fin);
        }

    }
}

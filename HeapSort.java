import static Utilidades.Print.print;
import static Utilidades.Swap.swap;

public class HeapSort {

    public static void siftDown(int[] arr, int n, int i) {
        /**
         * Se inicializa en el primer elemento la raiz buscando el max heap y sus hijos
         */
        int raizmax = i;
        int hijoizq = (2 * i) + 1;
        int hijoder = (2 * i) + 2;

        /**
         * Dado que la longitud del arreglo es n m podemos tener un problema buscando
         * las subramas de los nodos ultimos, por ello tenemos que hacer que sea menor
         * al tamaño del mismo
         */

        /**
         * Si el hijo izq es menor que la raiz máx actual actualizamos el índice del la
         * nueva raiz máxima
         */
        if (hijoizq < n && arr[hijoizq] > arr[raizmax]) {
            raizmax = hijoizq;
        }

        /**
         * Si el hijo derecho es menor que la raiz máx actual actualizamos el índice de
         * la nueva raíz máxima
         */
        if (hijoder < n && arr[hijoder] > arr[raizmax]) {
            raizmax = hijoder;
        }

        // Si hubo un cambio entre los indices hacemos swap
        if (raizmax != i) {
            System.out.println("Intercambiamos " + arr[i] + " con " + arr[raizmax]);
            swap(arr, i, raizmax);

            /**
             * Recursivamente necesitamos buscar el max-heap en los demas subárboles para
             */
            siftDown(arr, n, raizmax);
        }
    }

    public static void siftUp(int[] arr, int ultimo) {
        System.out.println("El último elemento es: " + arr[ultimo]);

        // Mientras el último elemento no este en el indice 0 seguimos
        while (ultimo > 0) {
            int padre = (ultimo - 1) / 2;
            if (arr[ultimo] > arr[padre]) {
                System.out.println("Intercambiamos " + arr[padre] + " con " + arr[ultimo]);
                swap(arr, ultimo, padre);
                ultimo = padre;
                print(arr);
            } else {
                break;
            }
        }
        System.out.println("El max-heap es: ");
        print(arr);
    }

    public static void heapSort(int[] arr) {
        // Fase 1: Obtener max Heap con siftUp
        for (int i = 0; i < arr.length; i++) {
            siftUp(arr, i);
            print(arr);
        }

        // Fase 2: Sacar los máximos y reordenar
        for (int i = arr.length - 1; i > 0; i--) {
            swap(arr, 0, i);
            siftDown(arr, i, 0);
            print(arr);
        }
    }
}

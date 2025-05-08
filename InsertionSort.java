import static Utilidades.Print.print;
public class InsertionSort {
    
    /**
     * Ordena un arreglo de enteros usando el algoritmo Insertion Sort.
     * Este método recorre el arreglo y en cada iteración coloca el elemento actual
     * en su posición correcta dentro de la parte ya ordenada.
     * 
     * @param arr Arreglo de enteros a ordenar.
     */
    public static void insertionSort(int[] arr) {
        int temp; // Variable temporal para intercambios
        for (int i = 1; i < arr.length; i++) {
            System.out.println("\nIteración #" + i + ":");
            System.out.println("Elemento actual: " + arr[i]);
            
            int j = i;
            // Mover el elemento actual hacia atrás hasta encontrar su posición correcta
            while (j > 0 && arr[j - 1] > arr[j]) {
                System.out.println("  Intercambiando " + arr[j] + " con " + arr[j - 1]);
                
                temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                --j;
                
                // Mostrar estado del arreglo después del intercambio
                print(arr); 
            }
            
            System.out.println("Arreglo después de la iteración #" + i + ":");
            print(arr);
        }
    }
}
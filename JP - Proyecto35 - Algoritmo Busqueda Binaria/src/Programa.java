import java.util.Random;

public class Programa {
	// Método que devuelve un arreglo de n enteros
	public static int [ ] generarArreglo(int n) {
		int [ ] arreglo = new int[n];
		// relleno el arreglo con valores aleatorios
		Random aleatorio = new Random();
		for(int i = 0; i < n ; i++) {
			arreglo[i] = aleatorio.nextInt(n);
		}
		return arreglo;
	}
	
    // Algoritmo de ordenamiento quicksort
    public static void quickSort(int[] arr, int low, int high) {
    																				opsQuickSort += 1;					// Comparación
        if (low < high) {
        	
            // Partition the array into two subarrays
            int pivotIndex = partition(arr, low, high);		opsQuickSort += 1;					// Asignación

            // Recursively sort each subarray
            quickSort(arr, low, pivotIndex - 1);					opsQuickSort += 1;					// Resta
            quickSort(arr, pivotIndex + 1, high);				opsQuickSort += 1;					// Suma
        }
    }

    public static int opsQuickSort = 0;
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];												opsQuickSort += 1;				// Asignacion
        																				opsQuickSort += 2;				// Asignacion, Resta
        int i = low - 1; // Index of the smaller element						

        																				opsQuickSort += 2;				// Asignacion, Comparacion
        for (int j = low; j < high; j++) {									opsQuickSort += 2;				// Comparacion, Incremento
            // If the current element is smaller than or equal to the pivot
        																				opsQuickSort += 1;				// Comparacion
            if (arr[j] <= pivot) {
                i++;																	opsQuickSort += 1;				// Incremento

                // Swap arr[i] and arr[j]
                int temp = arr[i];												opsQuickSort += 1;				// Asignacion
                arr[i] = arr[j];													opsQuickSort += 1;				// Asignacion
                arr[j] = temp;													opsQuickSort += 1;				// Asignacion
            }
        }

        // Swap arr[i+1] and arr[high] (pivot)
        int temp = arr[i + 1];												opsQuickSort += 2;				// Asignacion, Suma
        arr[i + 1] = arr[high];												opsQuickSort += 2;				// Suma, Asignacion
        arr[high] = temp;													opsQuickSort += 1;				// Asignacion

        																				opsQuickSort += 1;				// Suma
        return i + 1;
    }    
    	
	
	public static int opsBusquedaBinaria = 0;
    public static int busquedaBinaria(int target, int[] arr) {
        int left = 0;														opsBusquedaBinaria += 1;	// Asignacion
        int right = arr.length - 1;									opsBusquedaBinaria += 2;	// Asignacion, Resta
        																		opsBusquedaBinaria += 1;	// Comparacion 
        while (left <= right) {
            int mid = left + (right - left) / 2;					opsBusquedaBinaria += 4;	// Varias 
            																	opsBusquedaBinaria += 1;	// Comparacion 
            if (arr[mid] == target) {
                return mid; // Element found, return its index
            } 
            else if (arr[mid] < target) {
            																	opsBusquedaBinaria += 1;	// Comparacion 
                left = mid + 1; 											opsBusquedaBinaria += 2;	// Asignacion, Suma
            } else {
            																	opsBusquedaBinaria += 1;	// Comparacion
                right = mid - 1; 										opsBusquedaBinaria += 2;	// Asignacion, Resta 
            }
        }
        return -1; // Element not found in the array
    }
	
	public static void main(String[] args) {

		for(int i = 1; i <= 128; i++) {
			int [ ] arreglo = generarArreglo(i);
			opsBusquedaBinaria = 0;
			int posicionEncontrado = busquedaBinaria( -1000 , arreglo);
			//System.out.println("Para " + arreglo.length + " elementos se realizaron " + ops + " operaciones");
			System.out.println(opsBusquedaBinaria);
		}

	}
}
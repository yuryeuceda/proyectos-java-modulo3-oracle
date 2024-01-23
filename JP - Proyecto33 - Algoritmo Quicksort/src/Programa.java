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
	
	// Método que imprima un arreglo de n enteros
	public static void imprimirArreglo(int [ ] arreglo) {
		System.out.print("[");
		for(int i = 0 ; i < arreglo.length ; i++) {
			System.out.print( arreglo[i] + ( i < arreglo.length -1 ? "," : "" ) );
		}
		System.out.println("]");
	}
	
	// Método que ordena un arreglo de n enteros 
	// mediante el algoritmo de ordenamiento burbuja
    public static int bubbleSort(int[] arr) {
    	int ops = 0;
    	
        int n = arr.length;									ops += 1;			// Asignacion	
        boolean swapped;
        																ops += 3;			// Asignacion, Comparación, Resta
        for (int i = 0; i < n - 1; i++) {						ops += 3;			// Incremento, Comparación, Resta
            swapped = false;									ops += 1;			// Asignación

            															ops += 4;			// Asignación, Comparación, Resta, Resta
            for (int j = 0; j < n - 1 - i; j++) {				ops += 4;			// Incremento, Comparación, Resta, Resta
            															ops += 2;			// Comparación, Suma 
                if (arr[j] > arr[j + 1]) {						
                    // Swap arr[j] and arr[j+1]
                	int temp = arr[j];							ops += 1;			// Asignación	
                    arr[j] = arr[j + 1];							ops += 2;			// Asignación, Suma
                    arr[j + 1] = temp;							ops += 2;			// Suma, Asignación
                    swapped = true;							ops += 1;			// Asignación
                }
            }

            // If no two elements were swapped in inner loop, the array is already sorted
            															ops += 1;			// Comparación
            if (!swapped == true) {
                break;
            }
        }
        return ops;
    }	
	
    // Algoritmo de ordenamiento por seleccion
    public static int selectionSort(int[] arr) {
    	int ops = 0;
        int n = arr.length;								ops += 1;	// Asignacion
        															ops += 3;	// Asignacion, Comparación, Resta
        for (int i = 0; i < n - 1; i++) {					ops += 3;	// Comparación, Resta, Incremento 
            int minIndex = i;								ops += 1;	// Asignacion

            // Find the index of the minimum element in the unsorted part of the array
            														ops += 3;	// Asignacion, Suma, Comparacion 
            for (int j = i + 1; j < n; j++) {				ops += 2;	// Comparacion, Incremento
            														ops += 1;	// Comparación 
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;							ops += 1;	// Asignación
                }
            }

            // Swap the found minimum element with the first element in the unsorted part of the array
            int temp = arr[minIndex];				ops += 1;	// Asignación
            arr[minIndex] = arr[i];						ops += 1;	// Asignación
            arr[i] = temp;									ops += 1;	// Asignación
        }
        return ops;
    }    
    
    // Variable para calcular las operaciones del quicksort
	private static int opsQuickSort = 0;
    
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
    
	public static void main(String[] args) {
		//int elementos =20;
		for(int elementos = 200; elementos <= 300; elementos += 10) {
			int [ ] arregloPrueba = generarArreglo(elementos);
			//System.out.println("Antes del ordenamiento");
			//imprimirArreglo(arregloPrueba);
			opsQuickSort = 0;
			quickSort(arregloPrueba, 0, arregloPrueba.length - 1);
			//System.out.println("Después del ordenamiento");
			//imprimirArreglo(arregloPrueba);
			//System.out.println("Para "+elementos+" elementos, quickSort realizó "+opsQuickSort+" operaciones.");
			//System.out.println(elementos+","+opsQuickSort);
			System.out.println(opsQuickSort);
		}
	}
}
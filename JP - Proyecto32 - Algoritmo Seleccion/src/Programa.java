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
    
	public static void main(String[] args) {
		//int elementos =20;
		for(int elementos = 10; elementos <= 100; elementos += 10) {
			int [ ] arregloPrueba = generarArreglo(elementos);
			System.out.println("Antes del ordenamiento");
			imprimirArreglo(arregloPrueba);
			int operaciones = selectionSort(arregloPrueba);
			System.out.println("Después del ordenamiento");
			imprimirArreglo(arregloPrueba);
			System.out.println("Para "+elementos+" elementos, selectionSort realizó "+operaciones+" operaciones.");			
		}
	}
}
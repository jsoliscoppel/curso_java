package Lunes;

public class Bubble {
    // Elementos a ordenar como parámetros
    public static void bubbleSort(int[] arg)
    {
        // Longitud del arreglo
        int n = arg.length;
        
        int temp = 0;
        
        for( int i = 0; i < n; i++ ){
            for(int j = 1; j < n -i; j++){
                if ( arg[j-1] > arg[j] ){
                    temp = arg[j-1];
                    arg[j-1] = arg[j];
                    arg[j] = temp;
                }
            }
        }
        for(int m = 0; m < n; m++){
            System.out.println(arg[m]);
        }
        
    }
}

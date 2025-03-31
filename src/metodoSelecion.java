public class metodoSelecion {
    public int[] ordenarDesSeleccion (int[] arreglo, boolean pasos){
        int intercambios=0;
        int comparaciones=0;
        int n = arreglo.length;

        for (int i = 0; i<n-1; i++){
            int maxIdx = i; 
            for (int j= i+1; j<n; j++){
                //condicion parra encontrar el indice
                //que tiene el num mayor
                if (arreglo[maxIdx]< arreglo[j]){
                    maxIdx=j;
                }
                
                comparaciones++;
                if (pasos){
                    System.out.println("\ncomparación " + comparaciones + ": " + arreglo[maxIdx] + " < " + arreglo[j]);

                }
            }
            //cambio del index
            if (maxIdx != i){
                int aux= arreglo[maxIdx];
                arreglo[maxIdx]=arreglo[i];
                arreglo[i]=aux;
                intercambios++;
                if (pasos){
                    imprimirArregloEstado(arreglo);
                }   
                if (pasos) {
                    System.out.println("Intercambio: " + arreglo[i] + " <-> " + arreglo[maxIdx]);
                }
            }
        }
        System.out.println("\n-FIN DEL METODO-");
        System.out.print("arreglo ordenado -> ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
            if (i < arreglo.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println("comparaciones totales -> " + comparaciones);
        System.out.println("cambios totales -> " + intercambios);
        return new int[]{comparaciones, intercambios};
            
        
    }
    

    public int[] ordenarAsdSeleccion (int[] arreglo, boolean pasos){
        int comparaciones=0;
        int intercambios=0;
        int n= arreglo.length;
        for (int i = 0; i<n-1; i++){
            int minIdx = i; 
            for (int j= i+1; j<n; j++){
                comparaciones++;
                if (pasos){
                    System.out.println("\nComparación " + comparaciones + ": " + arreglo[j] + " > " + n);
                }
                //condicion para encontrar el indice
                //que tiene el num menor
                if (arreglo[minIdx]> arreglo[j]){
                    minIdx=j;
                }
                
                
            }
            //cambio del index
            if (minIdx != i){
                int aux= arreglo[minIdx];
                arreglo[minIdx]=arreglo[i];
                arreglo[i]=aux;
                intercambios++;
                if (pasos){
                    System.out.println("Intercambio: " + arreglo[i] + " <-> " + arreglo[minIdx]);
                }
                if (pasos){
                    imprimirArregloEstado(arreglo);
                }
            }
            
            
        }
        System.out.println("\n-FIN DEL METODO-");
        System.out.print("arreglo ordenado -> ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
            if (i < arreglo.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println("comparaciones Totales -> " + comparaciones);
        System.out.println("cambios Totales -> " + intercambios);
        return new int[]{comparaciones, intercambios};
    }

    public void ordenar(int[] arreglo, boolean ordenarDes, boolean pasos){
        if (ordenarDes){
            ordenarDesSeleccion(arreglo, pasos);
        } else {
            ordenarAsdSeleccion(arreglo, pasos);
        }

    }

    public void imprimirArregloEstado(int[] arreglo) {
        System.out.print("Estado actual -> ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
            if (i < arreglo.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

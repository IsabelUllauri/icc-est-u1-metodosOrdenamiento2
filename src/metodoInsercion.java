public class metodoInsercion {

    public int[] ordenarAscIns(int[] arreglo, boolean pasos){
        int comparaciones = 0;
        int intercambios = 0;

        for (int i=1; i< arreglo.length; i++){//int debe ser menor al tamano del arreglo
            int aux= arreglo[i]; //elemento a insertar
            int j=i-1; // indice del elmento anterior//i-1 porque se compara la pos 1,con la 0
            
            //mover elementos mayores que aux una posicion adelante
            while (j>= 0 && arreglo[j]> aux) {
                comparaciones++;
                if (pasos){
                    System.out.println("\nComparacion: "+ comparaciones + ": " + arreglo[j] + " > " + aux);
                    System.out.println("Intercambio: " + arreglo[j] + " -> " + arreglo[j + 1]);
                }
                arreglo[j+1]= arreglo[j];
                j--;   
                intercambios++;
                if (pasos){
                    imprimirArregloEstado(arreglo);
                }             
            }
            if (j >= 0) {
                comparaciones++;
                if (pasos) {
                    System.out.println("\nComparación " + comparaciones + ": " + arreglo[j] + " <= " + aux + " (No hay intercambio)");
                    imprimirArregloEstado(arreglo);
                }
            }
            arreglo [j+1]= aux; // insertar aux en pos correcta

        }
        System.out.println("\n -FIN DEL METODO- ");
        System.out.print("Arreglo ordenado -> ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
            if (i < arreglo.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println("Comparaciones totales -> " + comparaciones);
        System.out.println("Cambios totales -> " + intercambios);

        return new int[] {comparaciones, intercambios};
    }
    
    public int [] ordenarDescIns (int[] arreglo, boolean pasos){
        int comparaciones = 0;
        int intercambios = 0;
        for (int i=1; i< arreglo.length; i++){//int debe ser menor al tamano del arreglo
            int aux= arreglo[i]; //elemento a insertar
            int j=i-1; // indice del elmento anterior//i-1 porque se compara la pos 1,con la 0
           
            //mover elementos mayores que aux una posicion adelante
            while (j>= 0 && arreglo[j]< aux) {
                comparaciones++;
                if (pasos){
                    System.out.println("\n");
                    System.out.println("Comparacion: "+ comparaciones + ": " + arreglo[j] + " > " + aux);
                    System.out.println("Intercambio: " + arreglo[j] + " -> " + arreglo[j + 1]);
                 }
                arreglo[j+1]= arreglo[j];
                j--;    
                intercambios++;   
                if (pasos){
                    imprimirArregloEstado(arreglo);            
                }         
            }
            arreglo [j+1]= aux; // insertar aux en pos correcta

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
    public void ordenar(int[] arreglo, boolean ordenarDes, boolean pasos) {
        if (ordenarDes) {
            ordenarDescIns(arreglo, pasos);
        } else {
            ordenarAscIns(arreglo, pasos);
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
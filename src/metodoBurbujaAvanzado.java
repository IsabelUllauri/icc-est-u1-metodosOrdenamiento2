public class metodoBurbujaAvanzado {
    
    public int[] ordenarAsBurbujaAvanzado(int[] arreglo, boolean pasos){
        int comparaciones=0;
        int intercambios=0;
        int n=arreglo.length;
       
        for (int i=0; i<n; i++){
            boolean cambio= false;
            for (int j=0; j<n-1-i; j++){//-i s para que ya no compare con los que ya estan ordenados
                comparaciones++;
                if (pasos){
                    System.out.println("Comparando: " + arreglo[j] + " > " + arreglo[j+1]);
                }
                if (arreglo[j]>arreglo[j+1]){
                    int aux = arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                    intercambios++;
                    cambio=true;
                    if (pasos){
                        imprimirArregloEstado(arreglo);
                    }
                    if (pasos) {
                        System.out.println("Intercambio: " + arreglo[j] + " <-> " + arreglo[j + 1]);
                    }
                }
                
            }
            if (!cambio){
                break;
            }
        }       
        
        System.out.println("\n-FIN DEL METODO-");
        System.out.print("Arreglo ordenado -> ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
            if (i < arreglo.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println("\nComparaciones totales -> " + comparaciones);
        System.out.println("Cambios totales -> " + intercambios);
        return new int[]{comparaciones, intercambios};
        //int[]contadores={contComparaciones, contCambios};
    }

    public int[] ordenarDesBurbujaAvanzado(int[] arreglo, boolean pasos){
        int comparaciones=0;
        int intercambios=0;
        int n=arreglo.length;
        
        for (int i=0; i<n; i++){
            boolean cambio= false;
            for (int j=0; j<n-1-i; j++){//-i s para que ya no compare con los que ya estan ordenados
                comparaciones++;
                if (pasos){
                    System.out.println("Comparando: " + arreglo[i] + " > " + arreglo[j]);
                }
                if (arreglo[j]<arreglo[j+1]){
                    intercambios++;
                    int aux = arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                    cambio=true;
                    if (pasos){
                        imprimirArregloEstado(arreglo);
                    }
                }
                if (!cambio){
                    break;
                }
            }
        }       

        System.out.println("\n");
        imprimirArregloEstado(arreglo);
        System.out.println("Comparaciones totales -> " + comparaciones);
        System.out.println("Cambios totales -> " + intercambios);
        return new int[]{comparaciones, intercambios};

    }

    public void imprimirArregloEstado(int[] arreglo) {
        System.out.print("\nEstado actual -> ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
            if (i < arreglo.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    
    
}


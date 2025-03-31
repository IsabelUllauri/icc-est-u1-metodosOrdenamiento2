

public class metodoBurbuja{
    public int[] ordenarAscendenteB (int[] arreglo, boolean pasos) {
        int intercambios=0;
        int comparaciones=0;
        int n = arreglo.length;
    
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                comparaciones++;
                if (pasos){
                    System.out.println("\ncomparacion "+ comparaciones+" : "+ arreglo[i]+ " > "+ arreglo[j]);
                } 
                if(arreglo[i]> arreglo[j]){
                      
                    int aux = arreglo[j];
                    arreglo[j]=arreglo[i];
                    arreglo[i]= aux;
                    intercambios++;
                    if (pasos){
                        System.out.println("intercambio"+" : "+ arreglo[i]+ " <-> "+ arreglo[j]);

                    }
                    if (pasos){
                        imprimirArregloEstado(arreglo);
                    }
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
    public int[] ordenarDesB (int[] arreglo, boolean pasos){
        int n = arreglo.length;
        int intercambios=0;
        int comparaciones=0;
        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                comparaciones++;
                if (pasos){
                    System.out.println("\nComparación " + comparaciones + ": " + arreglo[i] + " > " + arreglo[j]);                }
                if(arreglo[i]< arreglo[j]){
                    int aux = arreglo[j];
                    arreglo[j]=arreglo[i];
                    arreglo[i]= aux;
                    intercambios++;
                    if (pasos){
                        System.out.println("Intercambio: \" + arreglo[i] + \" <-> \" + arreglo[j]");
                    }
                    if (pasos){
                        imprimirArregloEstado(arreglo);
                    }
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
        

    
    public void imprimirArreglo (int [] arreglo){
        for(int i=0; i<arreglo.length; i++){
            System.out.print(arreglo[i]+" -> ");
        }
        System.out.println();
    }

    public int[] ordenar(int[] arreglo, boolean ordenarDes, boolean pasos) {
        if (ordenarDes) {
            return ordenarDesB(arreglo, pasos);
        } else {
            return ordenarAscendenteB(arreglo, pasos);
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


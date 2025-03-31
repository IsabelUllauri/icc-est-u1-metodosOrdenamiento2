import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner= new Scanner(System.in);
        //clases
        General general= new General();
        metodoBurbuja metodoBurbujaClase = new metodoBurbuja();
        metodoSelecion mS = new metodoSelecion();
        metodoInsercion mI= new metodoInsercion();
        metodoBurbujaAvanzado mBA= new metodoBurbujaAvanzado();

        boolean continuar=true;
        int[] respuesta;
        boolean ascendente=true;
        
        while (continuar){
            
            int[] arreglo = {12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3, 27, -30, 14, 7, -1, 41, 20, -11, 8 };//array con valores definidos
            //int[] arreglo = new int [10000]; //array sin valores (posiciones vacias)
            //for (int i=0;i< arreglo.length;i++ ){
            //    arreglo[i]=(int)(Math.random()*10000)+1;//+1 para que no comience desde 0 (int) pq devuelve double
            //}

            //System.out.println("selecciona el metedo de ordenamiento: ");
            //System.out.println("1. burbuja");
            //System.out.println("2. seleccion");
            //System.out.println("3. insercion");
            //System.out.println("4. burbuja avanzado");
            //System.out.println("5. salir");
            //int metodo = scanner.nextInt();
            //int metodo= getPositive(scanner, "\tIngrese la opcion:  ");
            int metodo = -1;

            while (metodo < 1 || metodo > 5) {
                System.out.print("seleccione el metodo de ordenamiento: \n1. Burbuja \n2. Selección \n3. Inserción \n4. Burbuja Avanzado \n5. Salir ");
                if (scanner.hasNextInt()) {
                    metodo = scanner.nextInt();
                    if (metodo < 1 || metodo > 5) {
                    System.out.println("solo se permiten valores entre 1 y 5.");
                    }
                } else {
                System.out.println("por favor ingrese un numero entero.");
                scanner.next(); // limpia la entrada incorrecta
                }
            }

            if (metodo==5 ){// se pone el metodo 4 antes y fuera del switch es como darle prioidad y que se se escoge esa opcion se salga de una
                continuar= false;
                break;
            }

            Boolean conPasos = null;

            while (conPasos == null) {
                System.out.println("desea ver los pasos? (true/false): ");
                String entrada= scanner.next();
                if(entrada.equalsIgnoreCase("true")){
                    conPasos= true;
                }else if(entrada.equalsIgnoreCase("false")){
                    conPasos=false;
                } else{
                    System.out.println("solo se acepta 'TRUE' o 'FALSE'");
                }

            }     

            String orden = "";
            boolean valido= false;

            while (!valido) {
                System.out.println("desea ordenar ascendentemente (A) o descendentemenete (D)?: ");
                orden= scanner.next();
                if(orden.equalsIgnoreCase("A") || orden.equalsIgnoreCase("D")){
                    valido= true;
                }else {
                    System.out.println("solo se acepta 'A' o 'D'");
                }                
            }
            boolean ascendente1 = orden.equalsIgnoreCase("A");

            /* 
            System.out.println("desea ver los pasos? (true/false): ");
            boolean conPasos = scanner.nextBoolean();

            System.out.println("desea ordenar ascendentemente (A) o descendentemenete (D)?: ");
            String orden = scanner.next();
            boolean ascendente1 = orden.equalsIgnoreCase("A");
            String[] posibles= {"A", "D"};
            */

            /*String orden = getValidString(scanner, new String[]{"A", "D"}, "desea ordenar ascendentemente (A) o descendentemenete (D)?: ");
            boolean ascendente= orden.equalsIgnoreCase("A");
            int contComparaciones;
            int[] respuesta;*/


            switch(metodo){
                case 1:
                    System.out.println("\nMétodo burbuja "+"\nArreglo original:");
                    metodoBurbujaClase.imprimirArreglo(arreglo);
                    metodoBurbujaClase.ordenar(arreglo, !ascendente, conPasos);
                    break;
                case 2: 
                    System.out.println("\nMétodo selección "+"\nArreglo original:");
                    metodoBurbujaClase.imprimirArregloEstado(arreglo);
                    mS.ordenar(arreglo, !ascendente, conPasos);                    
                    break;

                case 3: 
                    System.out.println("\nMétodo insercion ");
                    System.out.println("arreglo orriginal: ");
                    metodoBurbujaClase.imprimirArreglo(arreglo);
                    mI.ordenar(arreglo, !ascendente, conPasos);
                    break;
                case 4:
                    System.out.println("\nBurbuja mejorado ");
                    System.out.println("arreglo original: ");
                    metodoBurbujaClase.imprimirArreglo(arreglo);
                    if (ascendente1){
                        respuesta=mBA.ordenarAsBurbujaAvanzado(arreglo, conPasos);
                    } else{
                        respuesta=mBA.ordenarDesBurbujaAvanzado(arreglo, conPasos);
                    }
                    break;

                default:
                    System.out.println("opcion incorrecta");
                
            }
        }

    }
}


    
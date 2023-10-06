package BusquedaYOrdenamiento;

public class Main {
    public static void main (String[] args){
        //Busqueda lineal
        Integer[] numeros={2, 5, 8, 6, 4, 3, 0, 9};
        SortAndSerch<Integer> s=new SortAndSerch<>();
        System.out.println(s.linealSearch(numeros, 0, 7, 100));

        String[] nombres={"Maria", "Juan", "Pedro", "Luis"};
        SortAndSerch<String> sn=new SortAndSerch<>();
        System.out.println(sn.linealSearch(nombres, 0, 3, "Juan"));

        //Busqueda binaria
        /*Integer[] numeros2={2,3,5,7,9,11,15,21,34,45,56};
        SortAndSerch<Integer> sb= new SortAndSerch<>();
        System.out.println("Búqueda binaria");
        System.out.println(sb.binarySearch(numeros2, 0, numeros2.length-1, 5));*/

        //ordenación por selección
        s.selectionSort(numeros);
        for (int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);
        }

    }
    
}
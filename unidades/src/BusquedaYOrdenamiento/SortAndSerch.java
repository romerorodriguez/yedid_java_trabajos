package BusquedaYOrdenamiento;

public class SortAndSerch <T extends Comparable> {
    //Busqueda linea1
    public boolean linealSearch(T[] data, int min, int max, T target){
        int index=min;
        boolean found=false;

        while(!found && index<=max){
            if (data[index].compareTo(target)==0){
                //-1=es inferior, 0=igual, 1=mayor
                found=true;
            }
            index++;
        }
        return found;
    }
}

//busqueda binaria
/*public boolean binarySearch(T[] data, int min, int max, T target){
    boolean found =false;
    int midpoint= (min+max)/2;

    if(data[midpoint].compareTo(target)==0){
        found=true;
    }else if(data[midpoint].compareTo(target)>0){
        if(min<=midpoint-1){
            found=binarySearch(data, min, midpoint-1, target);
        }else if(midpoint+1<=max){
            found=binarySearch(data, midpoint+1, max, target);
        }
    }
    return found;
    
}*/

public void selectionSort(T[] data){ //tiene que estar dentro de busqueda binaria//una llave debajo de return found
    int min;
    int temp; 
    for(int index=0;index<data.length-1;index++){
        min=index;
        for(int scan=index+1;scan<data.length;scan++){
            if(data[scan].compareTo(data[min]<0)){
                min=scan;
            }
        }
        temp=data[min];
        data[min]=data[index];
        data[index]=temp;
    }

}




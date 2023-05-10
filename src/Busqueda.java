import java.lang.Math;

public class Busqueda {
    public Busqueda() {
    }

    public int linearSearch(int[] arr, int target) {
       for(int i = 0; i< arr.length; i++){
           if (arr[i] == target) {
               return i;
           }else{
               return -1;
           }
           }
        return -1;
    }
    public int binarySearch(int[] arr, int target) {
        int min = 0;
        int max = arr.length - 1;
        int med = (min + max)/2;
        while (min <= max){
            if (arr[med] == target){
                return med;
            }else if (arr[med] < target){
                min = max + 1;
            }else{
                min = med - 1;
            }
            med = (min + max)/2;
        }
        return -1;
    }

    public int[] generateRandomArray(int size, int minValue, int maxValue){
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++){
            int valor = (int) Math.round(Math.random()*maxValue);
            if( valor >= minValue && valor <= maxValue){
                arr[i] = valor;
            }
        }
        return arr;
    }

    public int[] orderArray(int[] arr){
        int aux;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length - 1; j++){
                if (arr[j] < arr[j + 1]){
                    aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }
        return arr;
    }
    public void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

public class buscador {
    public String TiempoBusqueda(){
        String cadena=" ";
        int size=100;
        int valorInicial1=10;

        for (int i =0; i < 4; i++) {

            int[]arreglo= generateRandomArray(size,valorInicial1);

            //Busqueda lineal
            long tInicio1=System.nanoTime();
            searchLinear(arreglo,-1);
            long tFinal1=System.nanoTime();
            long tTotal1=tFinal1-tInicio1;

            //Busqueda Binaria
            long tInicio2=System.nanoTime();
            searchBinary(arreglo,-1);
            long tFinal2=System.nanoTime();
            long tTotal2=tFinal2-tInicio2;
            cadena+="\nArreglo "+i+": "+"\nTamaño: "+arreglo.length+" \nValor inicial: "+valorInicial1+"\nBusqueda Binaria: "+tTotal2+"\nBusqueda Lineal: "+tTotal1;

            size=size*10;

        }
        return cadena;
    }
    public int searchLinear(int[] nums, int target) {
        for (int i=0;i<nums.length;i++){
            if (target == nums[i]) {
                return i;
            }
        }
        return -1;
    }
    public int searchBinary(int[] nums, int target) {
        int izquierda = nums[0];
        int derecha = nums[nums.length - 1];

        while (izquierda <= derecha) {
            int medio = (izquierda + derecha) / 2;
            if (nums[medio] == target) {
                return medio;
            } else if (nums[medio] < target) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }
        return -1;
    }
    public int[] generateRandomArray(int size, int minValue) {
        int[] arr = new int[size];
        for (int i =0; i < size; i++) {
            arr[i] = minValue+i;
        }
        return arr;
    }
}

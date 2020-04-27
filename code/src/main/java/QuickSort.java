public class QuickSort {
    public static void main(String[] args) {

    }
    public static void quickSort(int[] array){
        quick_sort_c(array,0,array.length-1);
    }

    private static void quick_sort_c(int[] array, int p, int r) {
        if(p>=r){
            return;
        }
        int q = partition(array,p,r);
    }

}

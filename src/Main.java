import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    // run-time complexity = O(n Log n)
    // space complexity    = O(n)
    MergeSort m = new MergeSort();
    GnomeSort g = new GnomeSort();
    RadixSort r = new RadixSort();

    
    int[] array = {10, 50, 1, 0, 40, 15, 64};
        
    m.mergeSort(array);
    System.out.println("\nMerge Sort: ");    
    for(int i = 0; i < array.length; i++){
        System.out.print(array[i]+ " ");
    }

    QuickSort.quicksort(array, 0, array.length - 1);
     System.out.println("\nQuick Sort:\n"+Arrays.toString(array));

    g.gnomeSort(array, array.length);

    System.out.print("Gnome sort: \n");
    System.out.println(Arrays.toString(array));
    
    int n = array.length;
    System.out.print("Radix sort: \n");
    r.radixsort(array, n);
    for (int i = 0; i < n; i++)
        System.out.print(array[i] + " ");
   }
}

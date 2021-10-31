public class MergeSort extends MergeSortFunction implements Strategy {

    public void sort(Product[] list){
        sort_merge( list,0,list.length-1);


        System.out.println("sorting using quick sort strategy");
        for (int i = 0; i < list.length; ++i)
            System.out.println(list[i].toString() + " ");
    }

}
class MergeSortFunction
{

    void merge(Product arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        Product L[] = new Product[n1];
        Product R[] = new Product[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i].compareTo(R[j]) <= -1) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    void sort_merge(Product arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;

            // Sort first and second halves
            sort_merge(arr, l, m);
            sort_merge(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }}

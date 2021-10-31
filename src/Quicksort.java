public class Quicksort extends QuickSortFunction implements Strategy {

    public void sort(Product[] list){
        quick_sort( list,0,list.length-1);


        System.out.println("sorting using quick sort strategy");
        for (int i = 0; i < list.length; ++i)
            System.out.println(list[i].toString() + " ");
    }
}
    class QuickSortFunction
    {
        /* This function takes last element as pivot,
           places the pivot element at its correct
           position in sorted array, and places all
           smaller (smaller than pivot) to left of
           pivot and all greater elements to right
           of pivot */
        int partition(Product arr[], int low, int high)
        {
            Product pivot = arr[high];
            int i = (low-1); // index of smaller element
            for (int j=low; j<high; j++)
            {
                // If current element is smaller than or
                // equal to pivot
                if (arr[j].compareTo(pivot) <= -1)
                {
                    i++;

                    // swap arr[i] and arr[j]
                    Product temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            // swap arr[i+1] and arr[high] (or pivot)
            Product temp = arr[i+1];
            arr[i+1] = arr[high];
            arr[high] = temp;

            return i+1;
        }


        /* The main function that implements QuickSort()
          arr[] --> Array to be sorted,
          low  --> Starting index,
          high  --> Ending index */
        void quick_sort(Product arr[], int low, int high)
        {
            if (low < high)
            {
            /* pi is partitioning index, arr[pi] is
              now at right place */
                int pi = partition(arr, low, high);

                // Recursively sort elements before
                // partition and after partition
                quick_sort(arr, low, pi-1);
                quick_sort(arr, pi+1, high);
            }
        }
}


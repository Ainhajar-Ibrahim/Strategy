public class BubbleSort implements Strategy{
    public void sort(Product[] list){
        int n = list.length;
        Product temp = null;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(list[j - 1].compareTo(list[j]) >= 1){
                    //swap elements
                    temp = list[j-1];
                    list[j-1] = list[j];
                    list[j] = temp;
                }

            }
        }

        System.out.println("sorting using bubble sort strategy");
        for (int i = 0; i < list.length; ++i)
            System.out.println(list[i].toString() + " ");
    }
}

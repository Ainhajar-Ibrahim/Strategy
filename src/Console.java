public class Console {
    public static void main(String args[]) throws InterruptedException {
        Product[] list = {
                new Product("Hat", "49"),
                new Product("House", "20000"),
                new Product("Ball", "10"),
                new Product("Car", "1500"),
        };
         Context ctx = new Context(new BubbleSort(),"name");
         ctx.arrange(list);
         System.out.println("");
        // we can change the parameter of sorting
         ctx = new Context(new BubbleSort(),"price");
        ctx.arrange(list);
        System.out.println("");
        // we can change the strategy without changing Context class
         ctx = new Context(new Quicksort(),"name");
         ctx.arrange(list);
        System.out.println("");
        ctx = new Context(new Quicksort(),"price");
        ctx.arrange(list);
    }}

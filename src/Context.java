public class Context {

    private final Strategy strategy;
    String type;
    public Context(Strategy strategy,String type){
        this.strategy=strategy;
        this.type=type;
        Product.var=type;
    }
    public void arrange(Product[] input){
        strategy.sort(input);
    }
}

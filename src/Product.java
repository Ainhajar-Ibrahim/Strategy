
import static java.lang.Integer.parseInt;
import static java.lang.Integer.compare;

public class Product implements Comparable<Product> {

    String name;
    String price;


    public Product(String name, String price) {
        this.name = name;
        this.price = price;

    }
    static String var;
public String Choice(String type){

        if (type.equals("name")){
            return this.name;

        }
    if (type.equals("price")){
        return this.price;
    }

    return " ";
}

    @Override
    public String toString() {
        return this.name + ' ' + this.price ;
    }

    @Override
    public int compareTo(Product product) {
    if (var=="price"){
        return compare(parseInt((this.Choice(var))),parseInt((product.Choice(var))));
    }

        return this.Choice(var).compareTo(product.Choice(var));

    }

}

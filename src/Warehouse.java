import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Warehouse {
    Map<String, Integer> priceindex;
    Map<String, Integer> stockindex;


    public Warehouse(){
        priceindex = new HashMap<>();
        stockindex = new HashMap<>();
    }

    public void addProduct(String Product, int price, int stock){
        priceindex.put(Product, price);
        stockindex.put(Product, stock);
    }

    public int price(String product){
        int value;

        if(priceindex.get(product) == null){
            value = -99;
        }

        else{
            value = priceindex.get(product);
        }

        return value;
    }

    public int stock(String product){
        int value;

        if(stockindex.get(product) == null){
            value = 0;
        }

        else{
            value = stockindex.get(product);
        }

        return value;
    }

    public boolean take(String product){
        boolean state = true;
        if(stockindex.get(product) == null || stockindex.get(product) == 0){
            state = false;
        }

        else{
            stockindex.put(product, stockindex.get(product)-1);
        }

        return state;


    }

    public Set<String> products(){
        return stockindex.keySet();
    }

    public void print(){
        for(String i: stockindex.keySet()){
            System.out.println(i + ": " + String.valueOf(stockindex.get(i)));
        }
    }
}


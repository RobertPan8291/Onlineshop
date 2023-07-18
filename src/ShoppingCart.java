import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    Map<String, Item> cart;

    public ShoppingCart(){
        cart = new HashMap<>();
    }

    public void add(String product, int price){
        if(cart.containsKey(product)){
            cart.get(product).increaseQuantity();
        }
        else{
            Item cool = new Item(product, 1, price);
            cart.put(product, cool);
        }

    }

    public int price(){
        int number = 0;

        for(Item i : cart.values()){
            number += i.price();
        }

        return number;
    }

    public void print(){
        for(Item i : cart.values()){
            System.out.println(i.product + ": " + i.qty);
        }
    }
}

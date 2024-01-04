
import java.util.*;
public class MyHouse implements House  {
    int price;
    String address;
    public final double K = 23000;

    public MyHouse(int price, String address) {
        this.price = price;
        this.address = address;
    }

    @Override
    public double getPricetoUSD() {
        return this.price/K;
    }

    @Override
    public String getCode() {
        
        for (int i = 0; i < address.length(); i ++) 
           if(!Character.isDigit(address.charAt(i)))
            return (address.substring(address.length()-3));
        return address.substring(0, 3);
       
        
        
    }

}


import java.util.*;
public class MyBicycle implements IBicycle { 
@Override
    public void f1(List<Bicycle> a) {
        Bicycle min;
        int jmin;
        min=a.get(0); jmin=0;
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getPrice() <min.getPrice()) {
                min=a.get(i);jmin=i;
            }
        }
        a.remove(jmin);
    }
    

    @Override
    public int f2(List<Bicycle> a, String name) {
        int count  = 0;
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getName().toLowerCase().endsWith(name.toLowerCase())) 
                count++;
           
        }
        return count;
    }
}

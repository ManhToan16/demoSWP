
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class MyBicycle implements IBicycle{

    @Override
    public void f1(List<Bicycle> list) {
        float min=110;
        for (Bicycle bicycle : list) {
            if(bicycle.getPrice()<min)
                min=bicycle.getPrice();
            
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getPrice() == min)
            { list.remove(i);
            break;
            
            }
            
        }
    }

    @Override
    public int f2(List<Bicycle> list, String string) {
int count=0;
        for (Bicycle bicycle : list) {
            if(bicycle.getName().toUpperCase().endsWith(string.toUpperCase()))
                count++;
            
        }
        return count;

    }

	
}

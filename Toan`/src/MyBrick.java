
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author toanl
 */
public class MyBrick implements IBrick{

    @Override
    public int f1(List<Brick> t) {
        int result=0;
        for(Brick brick : t)
        {
            if(Character.isDigit(brick.getPlace().charAt(0))==true&&Character.isDigit(brick.getPlace().charAt(brick.getPlace().length()-1))==true) result++;
        }
        return result;
    }

    @Override
    public void f2(List<Brick> t) {
int max = t.get(0).getPrice();
		int position = 0;
		for (int i = 0; i < t.size(); i++) {
			if(t.get(i).getPrice() > max && t.get(i).getPrice() %2 == 1) {
				max = t.get(i).getPrice();
				position = i;
			}
		}
		t.get(position).setPlace("XX");    }

    @Override
    public void f3(List<Brick> t) {
        int max=t.get(0).getPrice();
        int position=0;
        for(int i=0;i<t.size();i++){
            if(t.get(i).getPrice()>max)
                max=t.get(i).getPrice();
        position=i;
        }
        
    }
    
    
}

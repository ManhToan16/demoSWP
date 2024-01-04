
public class SpecBrick extends Brick
{
    protected int color;

    public SpecBrick() {
    }

    public SpecBrick(int color, String place, int price) {
        super(place, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString()+", "+color;
    }
    public void setData(){
        super.setPlace(place.substring(0,2)+"BCA"+place.substring(0, 2));
    }
    public int getValue(){
        if(color>7) return price+9;
        else return price+6;
    }
    
    
 

  
}


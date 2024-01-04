
package Baitap;


public class speccar extends car {
    public int type;
    public String data;
    public speccar(){}
    
    public speccar(int type, String maker, int price) {
        super(maker, price);
        this.type = type;
    }
    public int getValue(){
      int inc = type< 7 ? 10 :15;
      return super.getPrice() +inc;
        
    }
    public String getData(){
        return data;
        
    }
    public void setData(){
        StringBuilder super.getMaker() = new StringBuilder(getMaker);
myName.setCharAt(4, 'x');

        super.price+=20;
        }

    @Override
    public String toString() {
        return super.toString() + ", " +type;
    }
    
    
    
}

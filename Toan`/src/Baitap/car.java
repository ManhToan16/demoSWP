
package Baitap;


 public class car{
    public String maker;
    public int price;
    public int rate;
    public car(){
    }
    
    car(String maker,int price){
        this.maker=maker;
        this.price=price;
        
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public car(String maker, int price, int rate) {
        this.maker = maker;
        this.price = price;
        this.rate = rate;
    }

    @Override
    public String toString() {
//        return "car{" + "maker=" + maker + ", price=" + price + '}';
     return maker+", "+price;
    }
    

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getPrice() {
        return price;
    }

    
    
    
}



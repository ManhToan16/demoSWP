
package box;

public class rectangle implements Icalculate,IDisplay{
    public double length;
    public double width;
    rectangle(){}
    rectangle(double width){
        this.width = (width>0)?width:0;
    }
    rectangle(double length,double width){
      this.length = (length>0)? length:0;
      this.width = (width>0)?width:0;
      
        
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return  "length= |" + length + "| width=" + width ;
    }
    @Override
    public double getArea(){
        return length*width;
        
    }
    @Override
    public double Perimeter(){
        return (length+width)*2;
    }

    @Override
    public void display() {
        System.out.println("Thong tin cua r: "+ this);
    }
    @Override
    public void diplayArea() {
        System.out.println("Chu vi cua r "+getArea());
    }

    @Override
    public void diplayPerimeter() {
        System.out.println("Dien tich cua r "+ Perimeter());
    }
    
    
}

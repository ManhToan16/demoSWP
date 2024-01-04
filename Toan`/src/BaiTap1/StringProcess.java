
package BaiTap1;

import java.util.Scanner;

public class StringProcess {
   public String str;
   public int len;

    public StringProcess() {
    }

    public StringProcess(String str) {
        this.str = str;
        this.len=str.length();
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "StringProcess{" + "str=" + str + ", len=" + len + '}';
    }
    
   public int letterCount(){
       int count=0;
       for(int i=0;i<len;i++)
       if(Character.isLetter(str.charAt(i))) count++;
       return count;
   }
   public int digitCount(){
int count=0;
for(int i=0;i<len;i++)
       if(Character.isDigit(str.charAt(i))) count++;
       return count;
}
   public boolean isDigit(){
       int count=0;
       for(int i=0;i<len;i++)
       if(Character.isDigit(str.charAt(i))) 
           count++;
       
       if(count==str.length())
           return true;
       else return false;
   }
   public boolean isLetter(){
       int count=0;
       for(int i=0;i<len;i++)
       if(Character.isLetter(str.charAt(i))) 
           count++;
       
       if(count==str.length())
           return true;
       else return false;
   }
   public String concat(String s){
       String value= str.concat(s);
       return value;
   }
   public void compareString(String s){
       if(str.equals(s)) System.out.println("Str bang S");
       else System.out.println("Str khong bang s");
       }
   public int search(char x){
       int position=0;
       for(int i=0;i<len;i++){
           if(str.charAt(i)== x) 
               
               position=i;
           
              
       }
        return position;
       
   }
   public int WordCount(){
       int WordCount=0;
       String[] strArr = str.split("\\s",0);
        for (String strArr1 : strArr) {
            if (!strArr1.isEmpty()) 
                WordCount++;         
        }
        return WordCount;
   }
   public void change(char x,char y){
       str=str.replace(x, y);
   }
   public void format() {
        str = str.toLowerCase();
        String[] words = str.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() > 0) {
                result.append(Character.toUpperCase(word.charAt(0)));
                result.append(word.substring(1).toLowerCase());
                result.append(" ");
            }
        }
        str = result.toString().trim();
    }
}



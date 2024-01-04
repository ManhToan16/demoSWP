/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author toanl
 */
public class MyString implements IString{

    @Override
    public int f1(String str) {
        int count=0;
        String[] s=str.split("\\s");
        for (int i = 0; i < s.length; i++) {
            char[] a=s[i].toCharArray();
            for (int j = 0; i < s.length; j++){
            if("13579".contains(""+a[j]))
            {
                count++;
                break;
            }
            }
            
        }
        return count;
        
    }

    @Override
    public String f2(String str) {
        int pos=1;
        String[] s=str.split("\\s");
        for (int i = 0; i < s.length; i++) {
         if(check(s[i])){
             pos=i;
             break;
         }}
         s[pos]="XX";
         String output="";
            for (int j = 0; j < s.length; j++) {
               output+=s[j]+" ";
                
            }
         return output.trim();
    }
    //palindrom
    public boolean check(String s){
        StringBuffer stringbuffer=new StringBuffer(s);
        if(stringbuffer.reverse().toString().equals(s))
            return true;
        return false;
        
    }
    
}

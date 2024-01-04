/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap1;

/**
 *
 * @author toanl
 */
public class main {
    public static void main(String[] args) {
        String str="Manh Toan dep trai no1";
        String s="Manh Toan no1 dep trai";
        String s3="Hello ";
        StringProcess str1=new StringProcess(str);
        StringProcess str2=new StringProcess(s);
        System.out.println(str1.WordCount());
        System.out.println(str1.concat(s3));
        System.out.println(str1.isDigit());
        
        str1.change('a', 'b');
        System.out.println(str1);
        str2.format();
        System.out.println(str2);
        
        
    }
}

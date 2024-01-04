
package toan;

import java.util.Scanner;
import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList();
        for(int i=0;i<5;i++)
        arr.add(sc.nextInt());
         for(int i=0;i<arr.size();i++)
        System.out.println("arr["+i+"] = "+arr.get(i));
         int index=sc.nextInt();
         arr.remove(index);
         for(Integer i :arr)
             System.out.println(i+"");
    }
    
}

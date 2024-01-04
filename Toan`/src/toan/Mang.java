
package toan;

import java.util.Scanner;


public class Mang {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
//        int n;
//        System.out.println("Nhap n= ");
//        n=sc.nextInt();
//        
//        int []arr= new int[n];
//       
//        for(int i =0;i<n;i++){
//            arr[i]= sc.nextInt();
//            
//        }
//        for(int i =0;i<n;i++){
//            System.out.println("Mang la "+arr[i]+" ");
//            
//        }
        int col,row;
        row= sc.nextInt();
        col= sc.nextInt();
        int arr[][]= new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("arr["+i+"]"+"["+j+"]=");
                arr[i][j]=sc.nextInt();
                
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
                
                
            }
            System.out.println();
        }
        
        
        
        
        
    
    
}
}

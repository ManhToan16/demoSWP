
package toan;

import java.util.Scanner;

//public static boolean checkPrime(int n){
//if (n<2) return false;
//
//
//}

public class hàm {
    
    public static void main(String[] args) {
        int n, sum = 0, tempSort;
         Scanner sc = new Scanner(System.in);
        do {
        System.out.println("Nhập vào số phần tử của mảng: ");
        n = sc.nextInt();
    } while (n < 0);
         
    // khởi tạo và cấp phát bộ nhớ cho mảng
    int array[] = new int[n];
         
    System.out.println("Nhập các phần tử cho mảng: ");
    for (int i = 0; i < n; i++) {
        System.out.print("Nhập phần tử thứ " + i + ": ");
        array[i] = sc.nextInt();
    }
         
    // Hiển thị mảng vừa nhập
    System.out.println("\nMảng ban đầu: ");
    for (int i = 0; i < n; i++) {
        System.out.print(array[i] + "\t");
    }
         
    // tính tổng các phần tử có trong mảng
    for (int i = 0; i < n; i++) {
        sum += array[i];
    }
    System.out.println("\nTổng các phần tử có trong mảng = " + sum);
         
    // sắp xếp theo thứ tự giảm dần
    for (int i = 0; i < n - 1; i++) {
        for (int j = i + 1; j <= n - 1; j++) {
            if (array[i] < array[j]) {
                tempSort = array[i];
                array[i] = array[j];
                array[j] = tempSort;
            }
        }
    }
    System.out.println("Mảng sau khi sắp xếp là: ");
    for (int i = 0; i < n; i++) {
        System.out.print(array[i] + "\t");
    }
         
    // tìm phần tử nhỏ nhất
    // sau khi sắp xếp theo thứ tự giảm dần 
    // thì phần tử nhỏ nhất là phần tử cuối cùng trong mảng
    System.out.println("\nPhần tử nhỏ nhất trong mảng là " + array[n - 1]);
    
        
             
    }
    
}





package toan;

import java.io.IOException;
import java.util.Scanner;

public class Workshop1 {public static void main(String[] args) {
    boolean c=true;
    while(c==true){ int n,t;
         Scanner sc = new Scanner(System.in);
         int number = performProgram();   
chooseNumber(number);
   
         
         int choice = sc.nextInt();
         if(choice!=1&&choice!=2&&choice!=3&&choice!=4&&choice!=5){
             System.out.println("Choose from 1 to 5");
             continue;
    } if(choice==5 ) continue;
    else
        do {
           
        System.out.print("Nhap vao phan tu cua mang: ");
        n = sc.nextInt();
         
        
    } while (n < 0);
        

         
    // khởi tạo và cấp phát bộ nhớ cho mảng
    int array[] = new int[n];
         
    System.out.println("Nhap cac phan tu cua mang: ");
    for (int i = 0; i < n; i++) {
        System.out.print("Nhap phan tu thu " + i + ": ");
        array[i] = sc.nextInt();
    }
    
  
    switch(choice){
        case 1: sortAscending(array, n);
        break;
        case 2: largSmall(array, n);
        break;
        case 3: oddEven(array, n);
        break;
        case 4: System.out.println("Enter an element you want to find: ");
        t=sc.nextInt();
            System.out.println("Index of "+t+" is "+findIndex(array, t));
            break;
        case 5:  
        break;
        
                
                    
    } //xoa man hinh de quay lai tu dau
            System.out.println("\nNhan phim bat ki de tiep tuc");
     sc.nextLine();
     try{
         Runtime.getRuntime().exec("cls");
     }catch(IOException ex){}
     sc.nextLine();
     
    
    
    }
}


public static int performProgram(){
int number;
Scanner pj= new Scanner(System.in);
    System.out.println("Please select a number that indicates what the program will perform");
    System.out.println("1.One-dimensional array: ");
    System.out.println("2.Two-dimensional array: ");
    System.out.println("3.Exit: ");
    System.out.print("Enter the number of your choice: ");
    number=pj.nextInt();
    return number;
}


public static void chooseOption(){
    System.out.println("=============================================");
    System.out.println("         ONE-DIMENSIONAL ARRAY        ");
    System.out.println("1. Sort ascending (on rows)");
    System.out.println("2. Print the largest and the smallest number");
    System.out.println("3. Print even and odd numbers in array");
    System.out.println("4. Find an element in array");
    System.out.println("5. Back to main menu");
    System.out.println("=============================================");
    System.out.print("Enter the number of your choice: ");
    
}
public static void largSmall(int[] arr, int n)
    {
        int largNum = arr[0], smallNum = arr[0];
        //iterates for largest number
        for(int i=1;i<n;i++)
            if(largNum < arr[i])
                largNum = arr[i];
        
        //iterates for the smallest number
        for(int i=1;i<n;i++)
            if(smallNum > arr[i])
                smallNum = arr[i];
        
        System.out.println("Largest Number: "+largNum);
        System.out.println("Smallest Number: "+smallNum);
    }

public static void chooseNumber(int number){

//Error: variable might have not been initialized
    if(number == 1)
        chooseOption();
    if(number == 2)
        twoDimen();
    if(number ==3)
        System.exit(0);
}


 public static void oddEven(int[] arr, int n)
 {
        
        System.out.print("Odd numbers:");
        for(int i = 0 ; i < n ; i++)
        {
            if(arr[i] % 2 != 0)
            {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println("");
        System.out.print("Even numbers:");
        for(int i = 0 ; i < n ; i++)
        {
            if(arr[i] % 2 == 0)
            {
                System.out.print(arr[i]+" ");
            }
        }
        
       
    }
public static void twoDimen(){
    int col,row;
    Scanner sc=new Scanner(System.in);
    System.out.println("         TWO-DIMENSIONAL ARRAY        ");
    System.out.println("Enter row");
        row= sc.nextInt();
        System.out.println("Enter col");
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
        System.out.println("\nNhan phim bat ki de tiep tuc");
     sc.nextLine();
     try{
         Runtime.getRuntime().exec("cls");
     }catch(IOException ex){}
     sc.nextLine();
     System.exit(0);
     
}
public static void sortAscending(int[] arr, int n)
    {
        int temp;
        //sort using simple sorting algorithms
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Ascending order: ");
        for(int i=0; i<n;i++)
            System.out.print(arr[i]+" ");
    }
public static int findIndex(int arr[], int t)
    {
 
        // if array is Null
        if (arr == null) {
            return -1;
        }
 
        // find length of array
        int len = arr.length;
        int i = 0;
 
        // traverse in the array
        while (i < len) {
 
            // if the i-th element is t
            // then return the index
            if (arr[i] == t) {
                return i;
            }
            else {
                i = i + 1;
            }
        }
        return -1;
        
    }
    
}

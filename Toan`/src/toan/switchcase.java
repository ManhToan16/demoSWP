
package toan;

import java.util.Scanner;


public class switchcase {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b;
        int t;
        
        do{
        System.out.println("Nhap thang");
        t=sc.nextInt();
        switch(t){
            case 1:
                case 3:
                    case 5:
                        case 7:
                            case 8:
                              case 10:
                                    case 12: System.out.println("Thang "+ t+ " co 31 ngay" );
                                    break;
                case 4:
                    case 6:
                        case 9:
                            case 11: System.out.println("Thang "+ t+ " co 30 ngay" );
                                    break;
                                    
                            case 2: System.out.println("Thang "+ t+ " co 28 ngay" );
                                    break;
                                    
                            default:
                                System.out.println("Nhap lai");
                                    
            
        }} while(t>0 && t<12);
    
        
    
}
}


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import jdk.nashorn.internal.objects.NativeArray;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MH
 */
public class EmployeeManager {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        List<Employee>  employee = new ArrayList<Employee>();
        List<Manager>  manager = new ArrayList<Manager>();
        List<Department> department = new ArrayList<>();
        
        int tc;
        int tcQuanLyVSNhanVien;
        int tcBoPhan;
        int tcChucDanh;
        int tcTimKiem;
        int HC = 0;
        int IT = 0;
        int MKT = 0;
        
        
        do{
            System.out.print(""
            +"1. Hiện thị các nhân viên hiện có trong công ty.\n"
            +"2. Hiện thị các bộ phận trong công ty.\n"
            +"3. Hiện thị các nhân viên theo từng bộ phân.\n"
            +"4. Thêm nhân viên với vào công ty.\n"
            +"5. Tìm kiếm thông tin theo tên hoặc mã nhân viên.\n"        
            +"6. Hiện thị bảng lương của nhân viên theo thứ tự giảm dần.\n"
            +"7. Hiện thị bảng lương của nhân viên theo thứ tự tăng dần.\n"
            +"0. Thoát chương trình."
            +"\nLựa chọn chủa bạn: "        
            );
            tc = sc.nextInt();
            
             if(tc==1){
                System.out.println("Mã nhân viên  | Tên nhân viên     | Tuổi   |HS Lương    |Ngày vào làm   | Ngày nghỉ phép  | Bộ phận         |Số giờ làm thêm/Chức vụ    |Lương");
                for (Manager manager1 : manager) {
                     manager1.displayInformation();
                }
                for (Employee employee1 : employee) {
                     employee1.displayInformation();
                }
            }else if(tc==2){
                    int hc =0;
                    int it = 0;
                    int mkt = 0;
                 for (Manager manager1 : manager) {
                     if(manager1.getBoPhanLamViec()==1)
                         hc++;
                     else if(manager1.getBoPhanLamViec()==2)
                         it++;
                     else if(manager1.getBoPhanLamViec()==3)
                         mkt++;
                 }
                 for (Employee employee1 : employee) {
                     if(employee1.getBoPhanLamViec()==1)
                         hc++;
                     else if(employee1.getBoPhanLamViec()==2)
                         it++;
                     else if(employee1.getBoPhanLamViec()==3)
                         mkt++;
                 }
                 System.out.println("Mã bộ phận | Tên bộ phận        | Số lượng nhân viên hiện tại");
                 System.out.println("HC         | Hành chính nhân sự | "+hc);
                 System.out.println("IT         | Công nghệ thông tin| "+it);
                 System.out.println("MKT        | Marketing          | "+mkt);
            }else if(tc==3){
                         System.out.println("Hành chính nhân sự");
                         System.out.println("Mã nhân viên  | Tên nhân viên     | Tuổi   |HS Lương    |Ngày vào làm   | Ngày nghỉ phép  | Bộ phận         |Số giờ làm thêm/Chức vụ    |Lương");
                 for (Manager manager1 : manager) {
                     if(manager1.getBoPhanLamViec()==1)
                         manager1.displayInformation();
                 }
                 for (Employee employee1 : employee) {
                     if(employee1.getBoPhanLamViec()==1)
                         employee1.displayInformation();
                 }
                         System.out.println("Công nghệ thông tin");
                         System.out.println("Mã nhân viên  | Tên nhân viên     | Tuổi   |HS Lương    |Ngày vào làm   | Ngày nghỉ phép  | Bộ phận         |Số giờ làm thêm/Chức vụ    |Lương");
                 for (Manager manager1 : manager) {
                     if(manager1.getBoPhanLamViec()==2)
                         manager1.displayInformation();
                 }
                 for (Employee employee1 : employee) {
                     if(employee1.getBoPhanLamViec()==2)
                         employee1.displayInformation();
                 }
                         System.out.println("Marketing");
                         System.out.println("Mã nhân viên  | Tên nhân viên     | Tuổi   |HS Lương    |Ngày vào làm   | Ngày nghỉ phép  | Bộ phận         |Số giờ làm thêm/Chức vụ    |Lương");
                 for (Manager manager1 : manager) {
                     if(manager1.getBoPhanLamViec()==3)
                         manager1.displayInformation();
                 }
                 for (Employee employee1 : employee) {
                     if(employee1.getBoPhanLamViec()==3)
                         employee1.displayInformation();
                 }
            }else if(tc==4){
                System.out.print(
                 "1.Thêm nhân viên thông thường\n"
                +"2.Thêm nhân viên là cap quản lý\n"
                +"Bạn chọn: "        
                );
                tcQuanLyVSNhanVien=sc.nextInt();
                sc.nextLine();
                if(tcQuanLyVSNhanVien==1){
                    System.out.print("Nhập mã nhân viên:");
                    String maNhanVien = sc.nextLine();
                    System.out.print("Nhập tên nhân viên:");
                    String tenNhanVien = sc.nextLine();
                    System.out.print("Nhập tuổi nhân viên:");
                    int tuoiNhanVien = sc.nextInt();
                    System.out.print("Nhập hệ số lương của nhân viên:");
                    double heSoLuong = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Nhập ngày vào làm của nhân viên:");
                    String ngayVaoLam = sc.nextLine();
                    System.out.print("Nhập số ngày nghỉ phép của nhân viên:");
                    int soNgayNghi = sc.nextInt();
                    System.out.print(
                     "1.HC - Hanh chinh nhan su\n"
                    +"2.IT - Cong nghe thong tin\n"
                    +"3.MKT - Marketing\n"   
                    +"Ban chon bo phan: "        
                    );tcBoPhan = sc.nextInt();
                    
                    if(tcBoPhan==1){
                        String tenBoPhan = "Hành chính nhân sự";
                        String maBoPhan = "HC";
                        
                        HC++;
                        Department departmentHC = new Department(maBoPhan, tenBoPhan, HC);
                        department.add(departmentHC);
                    }else if(tcBoPhan==2){
                        String tenBoPhan = "Công nghệ thông tin";
                        String maBoPhan = "IT";

                        HC++;
                        Department departmentIT = new Department(maBoPhan, tenBoPhan, HC);
                        department.add(departmentIT);
                    }else if(tcBoPhan==3){
                        String tenBoPhan = "Marketingự";
                        String maBoPhan = "MKT";
                        
                        MKT++;
                        Department departmentMKT = new Department(maBoPhan, tenBoPhan, MKT);
                        department.add(departmentMKT);
                    }
                    System.out.println("Nhap so gio lam them: "); int soGioLamThem = sc.nextInt();
                    Employee employee1 = new Employee(soGioLamThem, maNhanVien, tenNhanVien, tuoiNhanVien, heSoLuong, ngayVaoLam, tcBoPhan, soNgayNghi);
                    employee.add(employee1);
                        

                }else if(tcQuanLyVSNhanVien==2){
                    System.out.print("Nhap ma nhan vien: ");String maNhanVien = sc.nextLine();
                    System.out.print("Nhap ten nhan vien: ");String tenNhanVien = sc.nextLine();
                    System.out.print("Nhap tuoi nhan vien: ");int tuoiNhanVien = sc.nextInt();
                    System.out.print("Nhap he so luong cua nhan vien: ");double heSoLuong = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Nhap ngay vao lam cua nhan vien: ");String ngayVaoLam = sc.nextLine();
                    System.out.print("Nhap so ngay nghi phep cua nhan vien: ");int soNgayNghi = sc.nextInt();
                    System.out.print(
                     "1.HC - Hanh chinh nhan su\n"
                    +"2.IT - Cong nghe thong tin\n"
                    +"3.MKT - Marketing\n"   
                    +"Ban chon bo phan: "        
                    );tcBoPhan = sc.nextInt();
                    
                    if(tcBoPhan==1){
                        String tenBoPhan = "Hành chính nhân sự";
                        String maBoPhan = "HC";
                        
                        HC++;
                        Department departmentHC = new Department(maBoPhan, tenBoPhan, HC);
                        department.add(departmentHC);
                    }else if(tcBoPhan==2){
                        String tenBoPhan = "Công nghệ thông tin";
                        String maBoPhan = "IT";

                        HC++;
                        Department departmentIT = new Department(maBoPhan, tenBoPhan, HC);
                        department.add(departmentIT);
                    }else if(tcBoPhan==3){
                        String tenBoPhan = "Marketingự";
                        String maBoPhan = "MKT";
                        
                        MKT++;
                        Department departmentMKT = new Department(maBoPhan, tenBoPhan, MKT);
                        department.add(departmentMKT);
                    }
                    System.out.print(
                     "Chuc danh:\n"
                    +"1. Business Leader\n"
                    +"2. Project Leader\n"
                    +"3. Techical Leader\n"        
                    +"Nhap chuc danh:"        
                    );
                    tcChucDanh = sc.nextInt();
                    
                    Manager Manager1 = new Manager(tcChucDanh, maNhanVien, tenNhanVien, tuoiNhanVien, heSoLuong, ngayVaoLam, tcBoPhan, soNgayNghi);
                    manager.add(Manager1);
                }
            }else if(tc==5){
                 System.out.print(
                  "1. Tìm kiếm bằng tên:\n"
                 +"2. Tìm kiếm bằng mã nhân viên:\n"
                 +"Bạn chọn:"        
                 );tcTimKiem=sc.nextInt();
                 if(tcTimKiem==1){
                     System.out.print("Nhap tên nhân viên cần tìm:");
                         sc.nextLine();
                         String ten = sc.nextLine();
                         
                     for (Manager manager1 : manager) {
                         if(manager1.getTenNhanVien().indexOf(ten)>=0){
                             manager1.displayInformation();
                         }
                     }
                     for (Employee employee1 : employee) {
                         if(employee1.getTenNhanVien().indexOf(ten)>=0){
                             employee1.displayInformation();
                         }
                     }
                 }
                 else if(tc == 2){
                     System.out.println("Nhập mã nhân viên cần tìm");
                         sc.nextLine();
                         String ten = sc.nextLine();
                     for (Manager manager1 : manager) {
                         if(manager1.getMaNhanVien().indexOf(ten)>=0){
                             manager1.displayInformation();
                         }
                     }
                     for (Employee employee1 : employee) {
                         if(employee1.getMaNhanVien().indexOf(ten)>=0){
                             employee1.displayInformation();
                         }
                     }
                     
                 }
                 
            }else if(tc==6){
                System.out.println("Mã nhân viên  | Tên nhân viên     | Tuổi   |HS Lương    |Ngày vào làm   | Ngày nghỉ phép  | Bộ phận         |Số giờ làm thêm/Chức vụ    |Lương");
                    
                Collections.sort(employee, new Comparator<Employee>() {
                @Override
                public int compare(Employee Em1, Employee Em2) {
                if (Em1.calculateSalary() > Em2.calculateSalary()) {
                    return 1;
                } else {
                    if (Em1.calculateSalary() > Em2.calculateSalary()) {
                        return 0;
                    } else {
                        return -1;
                    }
                    }
                }

                });
                
                Collections.sort(manager, new Comparator<Manager>() {
                @Override
                public int compare(Manager Mn1, Manager Mn2) {
                if (Mn1.calculateSalary() > Mn2.calculateSalary()) {
                    return 1;
                } else {
                    if (Mn1.calculateSalary() > Mn2.calculateSalary()) {
                        return 0;
                    } else {
                        return -1;
                    }
                    }
                }

                });
                
                
                
                for (Manager manager1 : manager) {
                     manager1.displayInformation();
                }
                for (Employee employee1 : employee) {
                     employee1.displayInformation();
                }
            }else if(tc==7){
                System.out.println("Mã nhân viên  | Tên nhân viên     | Tuổi   |HS Lương    |Ngày vào làm   | Ngày nghỉ phép  | Bộ phận         |Số giờ làm thêm/Chức vụ    |Lương");
                    
                Collections.sort(employee, new Comparator<Employee>() {
                @Override
                public int compare(Employee Em1, Employee Em2) {
                if (Em1.calculateSalary() < Em2.calculateSalary()) {
                    return 1;
                } else {
                    if (Em1.calculateSalary() < Em2.calculateSalary()) {
                        return 0;
                    } else {
                        return -1;
                    }
                    }
                }

                });
                
                Collections.sort(manager, new Comparator<Manager>() {
                @Override
                public int compare(Manager Mn1, Manager Mn2) {
                if (Mn1.calculateSalary() < Mn2.calculateSalary()) {
                    return 1;
                } else {
                    if (Mn1.calculateSalary() < Mn2.calculateSalary()) {
                        return 0;
                    } else {
                        return -1;
                    }
                    }
                }

                });
                
                
                
                for (Manager manager1 : manager) {
                     manager1.displayInformation();
                }
                for (Employee employee1 : employee) {
                     employee1.displayInformation();
                }
            };
            
            
        
        }while(tc != 0);
}

}

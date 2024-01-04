
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MH
 */
public class Employee extends Staff implements ICalculator {

    private int soGioLamThem;

    public Employee(int soGioLamThem, String maNhanVien, String tenNhanVien, int tuoiNhanVien, double heSoLuong, String ngayVaoLam, int boPhanLamViec, int soNgayNghiPhep) {
        super(maNhanVien, tenNhanVien, tuoiNhanVien, heSoLuong, ngayVaoLam, boPhanLamViec, soNgayNghiPhep);
        this.soGioLamThem = soGioLamThem;
    }
    public Employee(){}
    
    

    public int getSoGioLamThem() {
        return soGioLamThem;
    }

    public void setSoGioLamThem(int soGioLamThem) {
        this.soGioLamThem = soGioLamThem;
    }

    @Override
    public String toString() {
        return "Employee{" + "soGioLamThem=" + soGioLamThem + '}';
    }
    public String tenBoPhan(int boPhan){
        if(boPhan == 1){
            return "Hành chính nhân sự";
        }else if(boPhan == 2)
            return "Công nghệ thông tin";
        else if(boPhan == 3)
            return "Marketing";
        else 
            return "error";
    }
    

    @Override
    public void displayInformation() {
        int numInt = (int) this.calculateSalary();
        System.out.println(this.getMaNhanVien()+"|     "+this.getTenNhanVien()+"|      "+this.getTuoiNhanVien()+"|     "+this.getHeSoLuong()+"|     "+this.getNgayVaoLam()+"|     "+this.getSoNgayNghiPhep()+"|    "+this.tenBoPhan(this.getBoPhanLamViec())+"|    " + this.getSoGioLamThem() +"|   "+numInt);
    }

    

    @Override
    public double calculateSalary() {
            return this.getHeSoLuong()*3000000+200000*this.getSoGioLamThem();
    }
    
    

    

    

    

    
    

    

    
    
}

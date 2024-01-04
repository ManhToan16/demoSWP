
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MH
 */
public class Manager extends Staff implements ICalculator{
    
    private int chucDanh;

    public Manager(int chucDanh, String maNhanVien, String tenNhanVien, int tuoiNhanVien, double heSoLuong, String ngayVaoLam, int boPhanLamViec, int soNgayNghiPhep) {
        super(maNhanVien, tenNhanVien, tuoiNhanVien, heSoLuong, ngayVaoLam, boPhanLamViec, soNgayNghiPhep);
        this.chucDanh = chucDanh;
    }
    
    public Manager(){
    }

    public int getChucDanh() {
        return chucDanh;
    }

    public void setChucDanh(int chucDanh) {
        this.chucDanh = chucDanh;
    }

    public String tenChucDanh(int chucDanh){
        if(chucDanh == 1){
            return "Business Leader";
        }else if(chucDanh==2){
            return "Project Leader";
        }else if(chucDanh==3){
            return "Technical Leader";
        }
        else return "error";
    }
    
    public String tenBoPhan(int boPhan){
        if(boPhan == 1){
            return "Hành chính nhân sự";
        }else if(boPhan == 2)
            return "Công nghệ thông tin";
        else if(boPhan == 3)
            return "Marketing";
        else return "error";
    }
    
    @Override
    void displayInformation() {
        int numInt = (int) this.calculateSalary();
        System.out.println(this.getMaNhanVien()+"|     "+this.getTenNhanVien()+"|     "+this.getTuoiNhanVien()+"|     "+this.getHeSoLuong()+"|     "+this.getNgayVaoLam()+"|     "+this.getSoNgayNghiPhep()+"|     "+this.tenChucDanh(this.getChucDanh())+"|     "+numInt);
    }

    @Override
    public double calculateSalary() {
        double luong = 0;
        if(this.getChucDanh()==1){
            return luong = this.getHeSoLuong()*5000000+8000000;
        }
            
        else if(this.getChucDanh()==2){
            return luong = this.getHeSoLuong()*5000000+5000000;
        }
        else if(this.getChucDanh()==3){
            return luong =  this.getHeSoLuong()*5000000+6000000;
        }
        return luong;
        
    }
    

    
    
    

    

    

    
    
}

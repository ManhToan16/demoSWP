/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MH
 */
public class Department extends Staff{
    private String maBoPhan;
    private String tenBoPhan;
    private int soLuongNhanVienHienTai = 0;

    
    
    public Department(String maBoPhan, String tenBoPhan,int soLuongNhanVienHienTai){
        this.tenBoPhan = tenBoPhan;
        this.maBoPhan = maBoPhan;
        this.soLuongNhanVienHienTai = soLuongNhanVienHienTai;
    }
    
    public Department(){
    
    }

    

    

    @Override
    public String toString() {
        return "Department{" + "maBoPhan=" + maBoPhan + ", tenBoPhan=" + tenBoPhan + ", soLuongNhanVienHienTai=" + soLuongNhanVienHienTai + '}';
    }

    @Override
    void displayInformation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MH
 */
abstract class Staff {
    protected String maNhanVien;
    protected String tenNhanVien;
    protected int tuoiNhanVien;
    protected double heSoLuong;
    protected String ngayVaoLam;
    protected int boPhanLamViec;
    protected int soNgayNghiPhep;
    
    abstract void displayInformation(); 

    public Staff(String maNhanVien, String tenNhanVien, int tuoiNhanVien, double heSoLuong, String ngayVaoLam, int boPhanLamViec, int soNgayNghiPhep) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.tuoiNhanVien = tuoiNhanVien;
        this.heSoLuong = heSoLuong;
        this.ngayVaoLam = ngayVaoLam;
        this.boPhanLamViec = boPhanLamViec;
        this.soNgayNghiPhep = soNgayNghiPhep;
    }
    
    public Staff(){}

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(int StringNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public int getTuoiNhanVien() {
        return tuoiNhanVien;
    }

    public void setTuoiNhanVien(int tuoiNhanVien) {
        this.tuoiNhanVien = tuoiNhanVien;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public String getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(String ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    public int getBoPhanLamViec() {
        return boPhanLamViec;
    }

    public void setBoPhanLamViec(int boPhanLamViec) {
        this.boPhanLamViec = boPhanLamViec;
    }

    public int getSoNgayNghiPhep() {
        return soNgayNghiPhep;
    }

    public void setSoNgayNghiPhep(int soNgayNghiPhep) {
        this.soNgayNghiPhep = soNgayNghiPhep;
    }

    

    
    
   
    
}

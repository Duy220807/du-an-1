/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.boxcf.models;

/**
 *
 * @author ji
 */
public class SanPham {

    int MaSP;
    String TenSP;
    long Gia;
    String HinhAnh;
    String MoTa;
    String MaDV;
    String MaLoai;

    public SanPham() {
    }

    public SanPham(int MaSP, String TenSP, long Gia, String HinhAnh, String MoTa, String MaDV, String MaLoai) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.Gia = Gia;
        this.HinhAnh = HinhAnh;
        this.MoTa = MoTa;
        this.MaDV = MaDV;
        this.MaLoai = MaLoai;
    }

    public int getMaSP() {
        return MaSP;
    }

    public void setMaSP(int MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public long getGia() {
        return Gia;
    }

    public void setGia(long Gia) {
        this.Gia = Gia;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public String getMoTa() {
        return MoTa;
    }

    public void setMoTa(String MoTa) {
        this.MoTa = MoTa;
    }

    public String getMaDV() {
        return MaDV;
    }

    public void setMaDV(String MaDV) {
        this.MaDV = MaDV;
    }

    public String getMaLoai() {
        return MaLoai;
    }

    public void setMaLoai(String MaLoai) {
        this.MaLoai = MaLoai;
    }
    
    
}

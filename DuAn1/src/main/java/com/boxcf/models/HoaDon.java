/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.boxcf.models;

import java.util.Date;

/**
 *
 * @author ji
 */
public class HoaDon {

    int MaHD;
    Date NgayTao;
    String TenKH;
    String MaNV;
    String GhiChu;
    long TONGTIEN;

    public HoaDon() {
    }

    public HoaDon(int MaHD, Date NgayTao, String TenKH, String MaNV, String GhiChu, long TONGTIEN) {
        this.MaHD = MaHD;
        this.NgayTao = NgayTao;
        this.TenKH = TenKH;
        this.MaNV = MaNV;
        this.GhiChu = GhiChu;
        this.TONGTIEN = TONGTIEN;
    }

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public long getTONGTIEN() {
        return TONGTIEN;
    }

    public void setTONGTIEN(long TONGTIEN) {
        this.TONGTIEN = TONGTIEN;
    }

}

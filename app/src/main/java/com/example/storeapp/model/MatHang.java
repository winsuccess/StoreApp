/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package com.example.storeapp.model;

import java.io.Serializable;
import java.util.Date;

public class MatHang implements Serializable {

    private static final long serialVersionUID = 1L;
    private String maMatHang;
    private String tenMatHang;
    private String danhMuc;
    private String moTa;
    private Double gia;
    private String anh;
    private Integer soLuongTonKho;
    private Integer soLuongDaBan;
    private Date ngayNhapKho;

    public MatHang() {
    }



    public MatHang(String maMatHang,
            String tenMatHang,
            String danhMuc,
            String moTa, Double gia,
            String anh, Integer soLuongTonKho,
            Integer soLuongDaBan, Date ngayNhapKho) {
        this.maMatHang = maMatHang;
        this.tenMatHang = tenMatHang;
        this.danhMuc = danhMuc;
        this.moTa = moTa;
        this.gia = gia;
        this.anh = anh;
        this.soLuongTonKho = soLuongTonKho;
        this.soLuongDaBan = soLuongDaBan;
        this.ngayNhapKho = ngayNhapKho;
    }

    public MatHang(
                   String tenMatHang,
                    Double gia,
                   String anh) {
        this.tenMatHang = tenMatHang;
        this.gia = gia;
        this.anh = anh;
    }


    public String getMaMatHang() {
        return maMatHang;
    }

    public void setMaMatHang(String maMatHang) {
        this.maMatHang = maMatHang;
    }

    public String getTenMatHang() {
        return tenMatHang;
    }

    public void setTenMatHang(String tenMatHang) {
        this.tenMatHang = tenMatHang;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public Integer getSoLuongTonKho() {
        return soLuongTonKho;
    }

    public void setSoLuongTonKho(Integer soLuongTonKho) {
        this.soLuongTonKho = soLuongTonKho;
    }

    public Integer getSoLuongDaBan() {
        return soLuongDaBan;
    }

    public void setSoLuongDaBan(Integer soLuongDaBan) {
        this.soLuongDaBan = soLuongDaBan;
    }

    public Date getNgayNhapKho() {
        return ngayNhapKho;
    }

    public void setNgayNhapKho(Date ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }

}

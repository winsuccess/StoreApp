/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
package com.example.storeapp.model;

import java.io.Serializable;
import java.util.Date;

public class DonHang implements Serializable {

    private static final long serialVersionUID = 1L;
    private String maDonHang;
    private String maKhachHang;
    private String diaChiGiaoHang;
    private Double tongTien;
    private Date ngayTao;

    public DonHang() {
    }

    public DonHang(String maDonHang,
           String maKhachHang,
            String diaChiGiaoHang, Double tongTien) {
        this.maDonHang = maDonHang;
        this.maKhachHang = maKhachHang;
        this.diaChiGiaoHang = diaChiGiaoHang;
        this.tongTien = tongTien;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getMaDonHang() {
        return maDonHang;
    }

    public void setMaDonHang(String maDonHang) {
        this.maDonHang = maDonHang;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getDiaChiGiaoHang() {
        return diaChiGiaoHang;
    }

    public void setDiaChiGiaoHang(String diaChiGiaoHang) {
        this.diaChiGiaoHang = diaChiGiaoHang;
    }

    public Double getTongTien() {
        return tongTien;
    }

    public void setTongTien(Double tongTien) {
        this.tongTien = tongTien;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maDonHang != null ? maDonHang.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are
        // not set
        if (!(object instanceof DonHang)) {
            return false;
        }
        DonHang other = (DonHang) object;
        if ((this.maDonHang == null && other.maDonHang != null)
                || (this.maDonHang != null
                        && !this.maDonHang.equals(other.maDonHang))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "banhang.DonHang[ maDonHang=" + maDonHang + " ]";
    }

}

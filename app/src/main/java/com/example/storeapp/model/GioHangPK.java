/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.storeapp.model;

import java.io.Serializable;


public class GioHangPK implements Serializable {

    /**  */
    private static final long serialVersionUID = 1L;
    private String maDonHang;
    private String maMatHang;

    public GioHangPK() {
    }

    public GioHangPK(String maDonHang, String maMatHang) {
        this.maDonHang = maDonHang;
        this.maMatHang = maMatHang;
    }

    public String getMaDonHang() {
        return maDonHang;
    }

    public void setMaDonHang(String maDonHang) {
        this.maDonHang = maDonHang;
    }

    public String getMaMatHang() {
        return maMatHang;
    }

    public void setMaMatHang(String maMatHang) {
        this.maMatHang = maMatHang;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maDonHang != null ? maDonHang.hashCode() : 0);
        hash += (maMatHang != null ? maMatHang.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GioHangPK)) {
            return false;
        }
        GioHangPK other = (GioHangPK) object;
        if ((this.maDonHang == null && other.maDonHang != null) || (this.maDonHang != null && !this.maDonHang.equals(other.maDonHang))) {
            return false;
        }
        if ((this.maMatHang == null && other.maMatHang != null) || (this.maMatHang != null && !this.maMatHang.equals(other.maMatHang))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "banhang.GioHangPK[ maDonHang=" + maDonHang + ", maMatHang=" + maMatHang + " ]";
    }

}

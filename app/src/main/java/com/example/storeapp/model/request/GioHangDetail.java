
package com.example.storeapp.model.request;

import java.io.Serializable;
import java.util.List;

public class GioHangDetail implements Serializable {

    /**  */
    private static final long serialVersionUID = 1L;

    private String maDonHang;
    private List<MatHangSoLuong> listMH;

    public GioHangDetail() {
    }

    public GioHangDetail(String maDonHang, List<MatHangSoLuong> listMH) {
        this.maDonHang = maDonHang;
        this.listMH = listMH;
    }

    public String getMaDonHang() {
        return maDonHang;
    }

    public void setMaDonHang(String maDonHang) {
        this.maDonHang = maDonHang;
    }

    public List<MatHangSoLuong> getListMH() {
        return listMH;
    }

    public void setListMH(List<MatHangSoLuong> listMH) {
        this.listMH = listMH;
    }

}

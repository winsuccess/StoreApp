
package com.example.storeapp.model.request;

import com.example.storeapp.model.MatHang;

import java.io.Serializable;

public class MatHangSoLuong implements Serializable {

    /**  */
    private static final long serialVersionUID = 1L;
    private MatHang matHang;
    private int soLuong;

    public MatHangSoLuong() {
    }

    public MatHangSoLuong(MatHang matHang, int soLuong) {
        this.matHang = matHang;
        this.soLuong = soLuong;
    }

    public MatHang getMatHang() {
        return matHang;
    }

    public void setMatHang(MatHang matHang) {
        this.matHang = matHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

}


package com.example.storeapp.model.request;

import java.io.Serializable;

public class MatHangRequest implements Serializable {

    /**  */
    private static final long serialVersionUID = 1L;
    private String danhMuc;
    private int trangThu;
    private String typeOrder;

    public MatHangRequest(String danhMuc, int trangThu, String typeOrder) {
        this.danhMuc = danhMuc;
        this.trangThu = trangThu;
        this.typeOrder = typeOrder;
    }

    public MatHangRequest() {
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }

    public int getTrangThu() {
        return trangThu;
    }

    public void setTrangThu(int trangThu) {
        this.trangThu = trangThu;
    }

    public String getTypeOrder() {
        return typeOrder;
    }

    public void setTypeOrder(String typeOrder) {
        this.typeOrder = typeOrder;
    }

}

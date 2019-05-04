
package com.example.storeapp.model.response;

import com.example.storeapp.model.DonHang;

import java.io.Serializable;
import java.util.List;

public class ListDonHang implements Serializable {
    /**  */
    private static final long serialVersionUID = 1L;
    private List<DonHang> danhSachDonHang;

    public ListDonHang(List<DonHang> danhSachDonHang) {
        this.danhSachDonHang = danhSachDonHang;
    }

    public ListDonHang() {
    }

    public List<DonHang> getDanhSachDonHang() {
        return danhSachDonHang;
    }

    public void setDanhSachDonHang(List<DonHang> danhSachDonHang) {
        this.danhSachDonHang = danhSachDonHang;
    }

}

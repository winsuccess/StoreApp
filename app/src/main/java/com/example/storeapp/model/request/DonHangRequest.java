
package com.example.storeapp.model.request;

import java.io.Serializable;

public class DonHangRequest implements Serializable {
    /**  */
    private static final long serialVersionUID = 1L;
    private String maKhachHang;
    private String diaChiGiaoHang;
    private GioHangDetail gioHangDetail;
    private Double tongTien;

    public DonHangRequest() {
    }

    public DonHangRequest(String maKhachHang, String diaChiGiaoHang,
            GioHangDetail gioHangDetail, Double tongTien) {
        this.maKhachHang = maKhachHang;
        this.diaChiGiaoHang = diaChiGiaoHang;
        this.gioHangDetail = gioHangDetail;
        this.tongTien = tongTien;
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

    public GioHangDetail getGioHangDetail() {
        return gioHangDetail;
    }

    public void setGioHangDetail(GioHangDetail gioHangDetail) {
        this.gioHangDetail = gioHangDetail;
    }

    public Double getTongTien() {
        return tongTien;
    }

    public void setTongTien(Double tongTien) {
        this.tongTien = tongTien;
    }

}

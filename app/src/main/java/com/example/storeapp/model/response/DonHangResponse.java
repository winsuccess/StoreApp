
package com.example.storeapp.model.response;

import com.example.storeapp.model.DonHang;
import com.example.storeapp.model.request.GioHangDetail;

import java.io.Serializable;

public class DonHangResponse implements Serializable {

    private static final long serialVersionUID = 1L;
    private DonHang donHang;
    private GioHangDetail gioHangDetail;
    private String message;

    public DonHangResponse(DonHang donHang, GioHangDetail gioHangDetail,
            String message) {
        super();
        this.donHang = donHang;
        this.gioHangDetail = gioHangDetail;
        this.message = message;
    }

    public DonHangResponse() {
        super();
    }

    public DonHang getDonHang() {
        return donHang;
    }

    public void setDonHang(DonHang donHang) {
        this.donHang = donHang;
    }

    public GioHangDetail getGioHangDetail() {
        return gioHangDetail;
    }

    public void setGioHangDetail(GioHangDetail gioHangDetail) {
        this.gioHangDetail = gioHangDetail;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}

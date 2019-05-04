
package com.example.storeapp.model;

import java.io.Serializable;

/**
 *
 * @author huhah
 */

public class GioHang implements Serializable {

    private static final long serialVersionUID = 1L;
    protected GioHangPK gioHangPK;
    private Integer soLuong;
    private DonHang donHang;
    private MatHang matHang;

    public GioHang() {
    }

    public GioHang(GioHangPK gioHangPK) {
        this.gioHangPK = gioHangPK;
    }

    public GioHang(String maDonHang, String maMatHang) {
        this.gioHangPK = new GioHangPK(maDonHang, maMatHang);
    }

    public GioHangPK getGioHangPK() {
        return gioHangPK;
    }

    public void setGioHangPK(GioHangPK gioHangPK) {
        this.gioHangPK = gioHangPK;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public DonHang getDonHang() {
        return donHang;
    }

    public void setDonHang(DonHang donHang) {
        this.donHang = donHang;
    }

    public MatHang getMatHang() {
        return matHang;
    }

    public void setMatHang(MatHang matHang) {
        this.matHang = matHang;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gioHangPK != null ? gioHangPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GioHang)) {
            return false;
        }
        GioHang other = (GioHang) object;
        if ((this.gioHangPK == null && other.gioHangPK != null) || (this.gioHangPK != null && !this.gioHangPK.equals(other.gioHangPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "banhang.GioHang[ gioHangPK=" + gioHangPK + " ]";
    }

}

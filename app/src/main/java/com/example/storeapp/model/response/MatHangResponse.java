
package com.example.storeapp.model.response;

import com.example.storeapp.model.MatHang;

import java.io.Serializable;
import java.util.List;

public class MatHangResponse implements Serializable {
    /**  */
    private static final long serialVersionUID = 1L;
    private List<MatHang> matHang;

    public MatHangResponse(List<MatHang> matHang) {
        super();
        this.matHang = matHang;
    }

    public MatHangResponse() {
        super();
    }

    public List<MatHang> getMatHang() {
        return matHang;
    }

    public void setMatHang(List<MatHang> matHang) {
        this.matHang = matHang;
    }

}

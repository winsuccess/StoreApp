package com.example.storeapp.controller;

import android.os.AsyncTask;

import com.example.storeapp.model.MatHang;
import com.example.storeapp.model.request.MatHangRequest;
import com.example.storeapp.model.response.DonHangResponse;
import com.example.storeapp.model.response.MatHangResponse;
import com.example.storeapp.model.response.ResponseMessage;

import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.ExecutionException;

public class RestControl {
    public DonHangResponse getDonHangFormServer()
            throws ExecutionException, InterruptedException {
        return new GetDonHang().execute("DH0002").get();
    }
    public MatHangResponse getBanChay(MatHangRequest matHangRequest)
            throws ExecutionException, InterruptedException {
        return new BanChay().execute(matHangRequest).get();
    }

    public MatHang getMatHang(String maMatHang)
            throws ExecutionException, InterruptedException {
        return new GetMatHang().execute(maMatHang).get();
    }

    public static final String HOSTNAME = "http://192.168.1.100:8080";

    public class GetDonHang extends AsyncTask<String, Void, DonHangResponse> {

        @Override
        protected DonHangResponse doInBackground(String... String) {
            RestTemplate rest = new RestTemplate();
            try {
                rest.getMessageConverters()
                        .add(new MappingJackson2HttpMessageConverter());
                rest.getMessageConverters()
                        .add(new StringHttpMessageConverter());
                String maDonHang = String[0];
                String c = HOSTNAME + "/api/don-hang/get/chi-tiet/" + maDonHang;
                DonHangResponse a = rest.getForObject(c, DonHangResponse.class);
                return a;
            } catch (Exception e) {
                System.out.println(e.toString());
                return null;
            }
        }
    }

    public class GetMatHang extends AsyncTask<String, Void, MatHang> {

        @Override
        protected MatHang doInBackground(String... String) {
            RestTemplate rest = new RestTemplate();
            try {
                rest.getMessageConverters()
                        .add(new MappingJackson2HttpMessageConverter());
                rest.getMessageConverters()
                        .add(new StringHttpMessageConverter());
                String maMatHang = String[0];
                String c = HOSTNAME + "/api/san-pham/get/chi-tiet/" + maMatHang;
                MatHang a = rest.getForObject(c, MatHang.class);
                return a;
            } catch (Exception e) {
                System.out.println(e.toString());
                return null;
            }
        }
    }

    public class DeleteDonHang extends AsyncTask<String, Void, ResponseMessage> {

        @Override
        protected ResponseMessage doInBackground(String... String) {
            RestTemplate rest = new RestTemplate();
            try {
                rest.getMessageConverters()
                        .add(new MappingJackson2HttpMessageConverter());
                rest.getMessageConverters()
                        .add(new StringHttpMessageConverter());
                String maDonHang = String[0];
                String c = HOSTNAME + "/api/don-hang/delete/" + maDonHang;
                ResponseMessage a = rest.getForObject(c, ResponseMessage.class);
                return a;
            } catch (Exception e) {
                System.out.println(e.toString());
                return null;
            }
        }
    }

    public class BanChay extends AsyncTask<MatHangRequest, Void, MatHangResponse> {

        @Override
        protected MatHangResponse doInBackground(MatHangRequest... MatHangRequest) {
            RestTemplate rest = new RestTemplate();
            try {
                rest.getMessageConverters()
                        .add(new MappingJackson2HttpMessageConverter());
                rest.getMessageConverters()
                        .add(new StringHttpMessageConverter());
                MatHangRequest matHang = MatHangRequest[0];
                String c = HOSTNAME + "/api/san-pham/get/ban-chay";
                MatHangResponse a = rest.postForObject(c,matHang, MatHangResponse.class);
                return a;
            } catch (Exception e) {
                System.out.println(e.toString());
                return null;
            }
        }
    }



}

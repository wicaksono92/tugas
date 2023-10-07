package com.nutech.tugas.payloads.requests;

public class TopUpRequest {

    private String idMerchant;
    private int nominal;

    public TopUpRequest() {
    }

    public TopUpRequest(String idMerchant, int nominal) {
        this.idMerchant = idMerchant;
        this.nominal = nominal;
    }

    public String getIdMerchant() {
        return idMerchant;
    }

    public void setIdMerchant(String idMerchant) {
        this.idMerchant = idMerchant;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }
}

package com.example.pringbacktest.CRUD.dto;

public class ProductDto {
    private int serialNum ;
    private String data;
    private String model;
    private String manufacturer;

    public ProductDto() {
    }

    public ProductDto(int serialNum, String data, String model, String manufacturer) {

        this.serialNum = serialNum;
        this.data = data;
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}

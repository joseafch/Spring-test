package com.example.pringbacktest.CRUD.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "products")
public class ProductEntity {
    @Id
    private int id;
    private int serialNum ;
    private String data;
    private String model;
    private String manufacturer;

    public ProductEntity() {
    }

    public ProductEntity(int id, int serialNum, String data, String model, String manufacturer) {
        this.id = id;
        this.serialNum = serialNum;
        this.data = data;
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

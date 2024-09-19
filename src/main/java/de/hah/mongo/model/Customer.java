package de.hah.mongo.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Customer {



    private  String id;
    private  String cxNo;
    private  String city;
    private  String name;



    public Customer(String id, String cxNo, String city, String name) {
        this.id = id;
        this.cxNo = cxNo;
        this.city = city;
        this.name = name;
    }
    public Customer(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCxNo() {
        return cxNo;
    }

    public void setCxNo(String cxNo) {
        this.cxNo = cxNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", cxNo='" + cxNo + '\'' +
                ", city='" + city + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

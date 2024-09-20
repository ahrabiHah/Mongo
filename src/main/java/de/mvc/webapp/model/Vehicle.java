package de.mvc.webapp.model;

public class Vehicle {

    private Integer id=244;

    private String company= "Ford";

    private Double cost;

    private String country;

    public Vehicle(){
        super();
    }
    public Vehicle(Integer id, String compny, Double cost, String country) {
        this.id = id;
        this.company = compny;
        this.cost = cost;
        this.country = country;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", compny='" + company + '\'' +
                ", cost=" + cost +
                ", country='" + country + '\'' +
                '}';
    }
}

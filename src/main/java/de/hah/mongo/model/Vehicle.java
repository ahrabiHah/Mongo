package de.hah.mongo.model;

public class Vehicle {

    private Integer id;

    private String compny;

    private Double cost;

    private String country;

    public Vehicle(){
        super();
    }
    public Vehicle(Integer id, String compny, Double cost, String country) {
        this.id = id;
        this.compny = compny;
        this.cost = cost;
        this.country = country;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompny() {
        return compny;
    }

    public void setCompny(String compny) {
        this.compny = compny;
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
                ", compny='" + compny + '\'' +
                ", cost=" + cost +
                ", country='" + country + '\'' +
                '}';
    }
}

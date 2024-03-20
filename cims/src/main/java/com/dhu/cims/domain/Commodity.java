package com.dhu.cims.domain;
public class Commodity {
    private Integer commodityId;
    private String commodityName;
    private String category;
    private Float cost;
    private Float price;
    public Integer getCommodityId() {
        return commodityId;
    }
    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }
    public String getCommodityName() {
        return commodityName;
    }
    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public Float getCost() {
        return cost;
    }
    public void setCost(Float cost) {
        this.cost = cost;
    }
    public Float getPrice() {
        return price;
    }
    public void setPrice(Float price) {
        this.price = price;
    }
    @Override
    public String toString(){
        return "Commodity{" +
                "commodityId="+ commodityId +
                ", commodityName='" + commodityName + '\'' +
                ", category='" + category + '\'' +
                ", cost=" + cost +
                ", price=" + price +
                "}";
    }
}

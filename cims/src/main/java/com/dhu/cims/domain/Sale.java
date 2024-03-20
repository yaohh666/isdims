package com.dhu.cims.domain;
public class Sale {
    private Integer storeId;
    private Integer commodityId;
    private Integer date;
    private Integer number;
    public Integer getStoreId() {
        return storeId;
    }
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }
    public Integer getCommodityId() {
        return commodityId;
    }
    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }
    public Integer getDate() {
        return date;
    }
    public void setDate(Integer date) {
        this.date = date;
    }
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    @Override
    public String toString(){
        return "Sale{" +
                "storeId=" + storeId +
                ", commodityId=" + commodityId +
                ", date='" + date + '\'' +
                ", number=" + number +
                "}";
    }
}

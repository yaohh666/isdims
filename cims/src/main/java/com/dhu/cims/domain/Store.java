package com.dhu.cims.domain;
public class Store {
    private Integer storeId;
    private String storeName;
    private String region;
    private String manager;
    // 默认为 0
    private Float amount;
    public Integer getStoreId() {
        return storeId;
    }
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }
    public String getStoreName() {
        return storeName;
    }
    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }
    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public String getManager() {
        return manager;
    }
    public void setManager(String manager) {
        this.manager = manager;
    }
    public Float getAmount() {
        return amount;
    }
    public void setAmount(Float amount) {
        this.amount = amount;
    }
    @Override
    public String toString(){
        return "Store{" +
                "storeId=" + storeId +
                ", storeName='" + storeName + '\'' +
                ", region='" + region + '\'' +
                ", manager='" + manager + '\'' +
                ", amount=" + amount +
                "}";
    }
}

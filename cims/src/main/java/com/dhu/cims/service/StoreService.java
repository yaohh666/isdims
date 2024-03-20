package com.dhu.cims.service;
import com.dhu.cims.domain.Store;
import java.util.List;
public interface StoreService {
    public List<Store> findAll();
    public Store findById(Integer storeId);
    public List<Store> findByStoreName(String storeName);
    public void insertStore(Store store);
    public void updateStore(Store store);
    public void deleteById(Integer storeId);
}

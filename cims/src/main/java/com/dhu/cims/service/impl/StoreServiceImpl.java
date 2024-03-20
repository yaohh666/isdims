package com.dhu.cims.service.impl;
import com.dhu.cims.domain.Store;
import com.dhu.cims.mapper.StoreMapper;
import com.dhu.cims.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Service
@Transactional
public class StoreServiceImpl implements StoreService{
    @Autowired
    private StoreMapper storeMapper;
    @Override
    public List<Store> findAll(){
        return storeMapper.findAll();
    }
    @Override
    public Store findById(Integer storeId){
        return storeMapper.findById(storeId);
    }
    @Override
    public List<Store> findByStoreName(String storeName){
        return storeMapper.findByStoreName(storeName);
    }
    @Override
    public void insertStore(Store store){
        storeMapper.insertStore(store);
    }
    @Override
    public void updateStore(Store store){
        storeMapper.updateStore(store);
    }
    @Override
    public void deleteById(Integer storeId){
        storeMapper.deleteById(storeId);
    }
}

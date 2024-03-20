package com.dhu.cims.service.impl;
import com.dhu.cims.domain.Commodity;
import com.dhu.cims.mapper.CommodityMapper;
import com.dhu.cims.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Service
@Transactional
public class CommodityServiceImpl implements CommodityService{
    @Autowired
    private CommodityMapper commodityMapper;
    @Override
    public List<Commodity> findAll(){
        return commodityMapper.findAll();
    }
    @Override
    public Commodity findById(Integer commodityId){
        return commodityMapper.findById(commodityId);
    }
    @Override
    public List<Commodity> findByCommodityName(String commodityName){
        return commodityMapper.findByCommodityName(commodityName);
    }
    @Override
    public void insertCommodity(Commodity commodity){
        commodityMapper.insertCommodity(commodity);
    }
    @Override
    public void updateCommodity(Commodity commodity){
        commodityMapper.updateCommodity(commodity);
    }
    @Override
    public void deleteById(Integer commodityId){
        commodityMapper.deleteById(commodityId);
    }
}

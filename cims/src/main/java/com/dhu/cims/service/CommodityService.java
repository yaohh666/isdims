package com.dhu.cims.service;
import com.dhu.cims.domain.Commodity;
import java.util.List;
public interface CommodityService {
    public List<Commodity> findAll();
    public Commodity findById(Integer commodityId);
    public List<Commodity> findByCommodityName(String commodityName);
    public void insertCommodity(Commodity commodity);
    public void updateCommodity(Commodity commodity);
    public void deleteById(Integer commodityId);
}

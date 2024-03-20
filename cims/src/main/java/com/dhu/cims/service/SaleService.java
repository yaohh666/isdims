package com.dhu.cims.service;
import com.dhu.cims.domain.Sale;
import java.util.List;
public interface SaleService {
    public List<Sale> findAll();
    public List<Sale> findByCommodityId(Integer commodityId);
    public List<Sale> findByStoreId(Integer storeId);
    public Sale findByCommodityIdAndStoreId(Integer commodityId,Integer storeId);
    public void insertSale(Sale sale);
    public void updateSale(Sale sale);
    public void deleteByCommodityIdAndStoreId(Integer commodityId,Integer storeId);
}

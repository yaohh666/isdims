package com.dhu.cims.service.impl;
import com.dhu.cims.domain.Sale;
import com.dhu.cims.domain.Store;
import com.dhu.cims.domain.Commodity;
import com.dhu.cims.mapper.SaleMapper;
import com.dhu.cims.mapper.StoreMapper;
import com.dhu.cims.mapper.CommodityMapper;
import com.dhu.cims.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Service
@Transactional
public class SaleServiceImpl implements SaleService {
    @Autowired
    private SaleMapper saleMapper;
    @Autowired
    private StoreMapper storeMapper;
    @Autowired
    private CommodityMapper commodityMapper;
    @Override
    public List<Sale> findAll(){
        return saleMapper.findAll();
    }
    @Override
    public List<Sale> findByCommodityId(Integer commodityId){
        return saleMapper.findByCommodityId(commodityId);
    }
    @Override
    public List<Sale> findByStoreId(Integer storeId){
        return saleMapper.findByStoreId(storeId);
    }
    @Override
    public Sale findByCommodityIdAndStoreId(Integer commodityId,Integer storeId){
        return saleMapper.findByCommodityIdAndStoreId(commodityId,storeId);
    }
    @Override
    public void insertSale(Sale sale){
        saleMapper.insertSale(sale);
        Commodity commodity = commodityMapper.findById(sale.getCommodityId());
        Store store = storeMapper.findById(sale.getStoreId());
        Float money = commodity.getPrice()*sale.getNumber();
        System.out.println(money);
        Float amount = store.getAmount();
        System.out.println(amount);
        store.setAmount(amount+money);
        storeMapper.updateStore(store);
    }
    @Override
    public void updateSale(Sale sale){
        Commodity commodity = commodityMapper.findById(sale.getCommodityId());
        Store store = storeMapper.findById(sale.getStoreId());
        Sale oldSale = saleMapper.findByCommodityIdAndStoreId(sale.getCommodityId(),sale.getStoreId());
        Integer diff = sale.getNumber()-oldSale.getNumber();
        Float money = commodity.getPrice()*diff;
        Float amount = store.getAmount();
        store.setAmount(amount+money);
        storeMapper.updateStore(store);
        saleMapper.updateSale(sale);
    }
    @Override
    public void deleteByCommodityIdAndStoreId(Integer commodityId,Integer storeId){
        Sale sale = saleMapper.findByCommodityIdAndStoreId(commodityId,storeId);
        Commodity commodity = commodityMapper.findById(commodityId);
        Store store = storeMapper.findById(storeId);
        Float money = commodity.getPrice()*sale.getNumber();
        Float amount = store.getAmount();
        store.setAmount(amount-money);
        storeMapper.updateStore(store);
        saleMapper.deleteByCommodityIdAndStoreId(commodityId,storeId);
    }
}

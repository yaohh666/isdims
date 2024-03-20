package com.dhu.cims.controller;
import com.dhu.cims.domain.Sale;
import com.dhu.cims.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class SaleController {
    @Autowired
    private SaleService saleService;
    // 查找全部订单
    @CrossOrigin
    @GetMapping(value = "api/sale")
    public List<Sale> findAll(){
        return saleService.findAll();
    }
    // 根据商品 Id 查找该商品的全部订单
    @CrossOrigin
    @GetMapping(value = "api/sale/commodity/{commodityId}")
    public List<Sale> findByCommodityId(@PathVariable("commodityId") Integer commodityId){
        return saleService.findByCommodityId(commodityId);
    }
    // 根据商店 Id 查找该商店的全部订单
    @CrossOrigin
    @GetMapping(value = "api/sale/store/{storeId}")
    public List<Sale> findByStoreId(@PathVariable("storeId") Integer storeId){
        return saleService.findByStoreId(storeId);
    }
    // 根据商店 Id 和商品 Id 查找唯一订单
    @GetMapping(value = "api/sale/search")
    public Sale findByCommodityIdAndStoreId(Integer commodityId,Integer storeId){
        return saleService.findByCommodityIdAndStoreId(commodityId,storeId);
    }
    // 新增订单
    @CrossOrigin
    @PostMapping(value = "api/sale/insert")
    public void insertSale(@RequestBody Sale sale){
        saleService.insertSale(sale);
    }
    // 修改订单
    @CrossOrigin
    @PostMapping(value = "api/sale/update")
    public void updateSale(@RequestBody Sale sale){
        saleService.updateSale(sale);
    }
    // 删除订单
    @CrossOrigin
    @PostMapping(value = "api/sale/delete")
    public void deleteByCommodityIdAndStoreId(@RequestBody Sale sale){
        saleService.deleteByCommodityIdAndStoreId(sale.getCommodityId(),sale.getStoreId());
    }
}

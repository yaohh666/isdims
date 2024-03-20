package com.dhu.cims.controller;
import com.dhu.cims.domain.Commodity;
import com.dhu.cims.result.Result;
import com.dhu.cims.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class CommodityConrtroller {
    @Autowired
    private CommodityService commodityService;
    // 查找全部商品
    @CrossOrigin
    @GetMapping(value = "api/commodity")
    public List<Commodity> findAll(){
        return commodityService.findAll();
    }
    // 根据商品名模糊查询商品
    @CrossOrigin
    @GetMapping(value = "api/commodity/{commodityName}")
    public List<Commodity> findByCommodityName(@PathVariable("commodityName") String commodityName){
        return commodityService.findByCommodityName(commodityName);
    }
    // 新增商品
    @CrossOrigin
    @PostMapping(value = "api/commodity/insert")
    public void insertCommodity(@RequestBody Commodity commodity){
        commodityService.insertCommodity(commodity);
    }
    // 修改商品
    @CrossOrigin
    @PostMapping(value = "api/commodity/update")
    public Result updateCommodity(@RequestBody Commodity commodity){
        commodityService.updateCommodity(commodity);
        return new Result(200);
    }
    // 删除商品
    @CrossOrigin
    @PostMapping(value = "api/commodity/delete")
    public Result deleteById(@RequestBody Commodity commodity){
        commodityService.deleteById(commodity.getCommodityId());
        return new Result(200);
    }
}

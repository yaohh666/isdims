package com.dhu.cims.controller;
import com.dhu.cims.domain.Store;
import com.dhu.cims.result.Result;
import com.dhu.cims.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class StoreController {
    @Autowired
    private StoreService storeService;
    // 查找全部商店
    @CrossOrigin
    @GetMapping(value = "api/store")
    public List<Store> findAll(){
        return storeService.findAll();
    }
    // 根据商店名模糊查询商店
    @CrossOrigin
    @GetMapping(value = "api/store/{storeName}")
    public List<Store> findByStoreName(@PathVariable("storeName") String storeName){
        return storeService.findByStoreName(storeName);
    }
    // 新增商店
    @CrossOrigin
    @PostMapping(value = "api/store/insert")
    public void insertStore(@RequestBody Store store){
        storeService.insertStore(store);
    }
    // 修改商店
    @CrossOrigin
    @PostMapping(value = "api/store/update")
    public Result updateStore(@RequestBody Store store){
        storeService.updateStore(store);
        return new Result(200);
    }
    // 删除商店
    @CrossOrigin
    @PostMapping(value = "api/store/delete")
    public Result deleteById(@RequestBody Store store){
        storeService.deleteById(store.getStoreId());
        return new Result(200);
    }
}

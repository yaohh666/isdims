package com.dhu.cims.mapper;
import com.dhu.cims.domain.Store;
import org.apache.ibatis.annotations.*;
import java.util.List;
@Mapper
public interface StoreMapper {
    @Select("SELECT * FROM store")
    public List<Store> findAll();
    @Select("SELECT * FROM store WHERE store_id = #{storeId}")
    public Store findById(Integer storeId);
    @Select("SELECT * FROM store WHERE store_name like concat('%',#{storeName},'%')")
    public List<Store> findByStoreName(String storeName);
    @Insert("INSERT INTO store(store_name,region,manager,amount)" +
            "VALUES(#{storeName},#{region},#{manager},0)")
    @Options(useGeneratedKeys = true,keyProperty = "storeId",keyColumn = "store_id")
    public void insertStore(Store store);
    @Update("<script>UPDATE store SET store_name=#{storeName}," +
            "<if test='amount!=null'>amount=#{amount},</if>region=#{region},manager=#{manager} " +
            "WHERE store_id = #{storeId}</script>")
    public void updateStore(Store store);
    @Delete("DELETE FROM store WHERE store_id = #{storeId}")
    public void deleteById(Integer storeId);
}

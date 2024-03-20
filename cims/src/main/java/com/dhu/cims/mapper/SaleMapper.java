package com.dhu.cims.mapper;
import com.dhu.cims.domain.Sale;
import org.apache.ibatis.annotations.*;
import java.util.List;
@Mapper
public interface SaleMapper {
    @Select("SELECT * FROM sale ORDER BY date ASC")
    public List<Sale> findAll();
    @Select("SELECT * FROM sale WHERE commodity_id = #{commodityId}")
    public List<Sale> findByCommodityId(Integer commodityId);
    @Select("SELECT * FROM sale WHERE store_id = #{storeId}")
    public List<Sale> findByStoreId(Integer storeId);
    @Select("SELECT * FROM sale WHERE commodity_id = #{commodityId} AND store_id = #{storeId}")
    public Sale findByCommodityIdAndStoreId(Integer commodityId,Integer storeId);
    @Insert("INSERT INTO sale(commodity_id,store_id,date,number) VALUES(#{commodityId},#{storeId},#{date},#{number})")
    public void insertSale(Sale sale);
    @Update("UPDATE sale SET date=#{date},number=#{number} " +
            "WHERE commodity_id = #{commodityId} AND store_id = #{storeId}")
    public void updateSale(Sale sale);
    @Delete("DELETE FROM sale WHERE commodity_id = #{commodityId} AND store_id = #{storeId}")
    public void deleteByCommodityIdAndStoreId(Integer commodityId,Integer storeId);
}

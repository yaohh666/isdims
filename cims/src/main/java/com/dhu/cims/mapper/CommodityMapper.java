package com.dhu.cims.mapper;
import com.dhu.cims.domain.Commodity;
import org.apache.ibatis.annotations.*;
import java.util.List;
@Mapper
public interface CommodityMapper {
    @Select("SELECT * FROM commodity")
    public List<Commodity> findAll();
    @Select("SELECT * FROM commodity WHERE commodity_id = #{commodityId}")
    public Commodity findById(Integer commodityId);
    @Select("SELECT * FROM commodity WHERE commodity_name like concat('%',#{commodityName},'%')")
    public List<Commodity> findByCommodityName(String commodityName);
    @Insert("INSERT INTO commodity(commodity_name,category,cost,price)" +
            "VALUES(#{commodityName},#{category},#{cost},#{price})")
    @Options(useGeneratedKeys = true,keyProperty = "commodityId",keyColumn = "commodity_id")
    public void insertCommodity(Commodity commodity);
    @Update("UPDATE commodity SET commodity_name=#{commodityName}," +
            "category=#{category},cost=#{cost},price=#{price}" +
            "WHERE commodity_id = #{commodityId}")
    public void updateCommodity(Commodity commodity);
    @Delete("DELETE FROM commodity WHERE commodity_id = #{commodityId}")
    public void deleteById(Integer commodityId);
}

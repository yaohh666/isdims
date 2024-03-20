package com.dhu.cims.mapper;
import com.dhu.cims.domain.User;
import org.apache.ibatis.annotations.*;
import java.util.List;
@Mapper
public interface UserMapper {
    @Select("SELECT * FROM user")
    public List<User> findAll();
    @Select("SELECT * FROM user WHERE username like concat('%',#{username},'%')")
    public List<User> findAllByUsername(String username);
    @Select("SELECT * FROM user WHERE username = #{username}")
    public User findByUsername(String username);
    @Select("SELECT * FROM user WHERE username = #{username} AND password = #{password}")
    public User findByUsernameAndPassword(String username,String password);
    @Insert("INSERT INTO user(username,password) VALUES(#{username},#{password})")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    public void insertUser(User user);
    @Update("UPDATE user SET username=#{username},password=#{password} WHERE id=#{id}")
    public void updateUser(User user);
    @Delete("DELETE FROM user WHERE id=#{id}")
    public void deleteById(Integer id);
}

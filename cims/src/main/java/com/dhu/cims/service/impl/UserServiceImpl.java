package com.dhu.cims.service.impl;
import com.dhu.cims.domain.User;
import com.dhu.cims.mapper.UserMapper;
import com.dhu.cims.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Service
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findAll(){
        return userMapper.findAll();
    }
    @Override
    public List<User> findAllByUsername(String username){
        return userMapper.findAllByUsername(username);
    }
    @Override
    public User findByUsername(String username){
        return userMapper.findByUsername(username);
    }
    @Override
    public User findByUsernameAndPassword(String username,String password){
        return userMapper.findByUsernameAndPassword(username,password);
    }
    @Override
    public void insertUser(User user){
        userMapper.insertUser(user);
    }
    @Override
    public void updateUser(User user){
        userMapper.updateUser(user);
    }
    @Override
    public void deleteById(Integer id){
        userMapper.deleteById(id);
    }
}

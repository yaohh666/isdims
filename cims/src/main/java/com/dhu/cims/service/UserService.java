package com.dhu.cims.service;
import com.dhu.cims.domain.User;
import java.util.List;
public interface UserService {
    public List<User> findAll();
    public List<User> findAllByUsername(String username);
    public User findByUsername(String username);
    public User findByUsernameAndPassword(String username,String password);
    public void insertUser(User user);
    public void updateUser(User user);
    public void deleteById(Integer id);
}

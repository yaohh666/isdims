package com.dhu.cims.controller;
import com.dhu.cims.domain.User;
import com.dhu.cims.result.Result;
import com.dhu.cims.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    // 查找全部用户
    @CrossOrigin
    @GetMapping(value = "api/user")
    public List<User> findAll(){
        return userService.findAll();
    }
    // 根据用户名模糊查询用户
    @CrossOrigin
    @GetMapping(value = "api/user/{username}")
    public List<User> findAllByUsername(@PathVariable("username") String username){
        return userService.findAllByUsername(username);
    }
    // 修改账号密码
    @CrossOrigin
    @PostMapping(value = "api/user/update")
    public Result updateUser(@RequestBody User user){
        userService.updateUser(user);
        return new Result(200);
    }
    // 删除账号
    @CrossOrigin
    @PostMapping(value = "api/user/delete")
    public Result deleteById(@RequestBody User user){
        userService.deleteById(user.getId());
        return new Result(200);
    }
}

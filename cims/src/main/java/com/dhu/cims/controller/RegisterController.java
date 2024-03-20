package com.dhu.cims.controller;
import com.dhu.cims.domain.User;
import com.dhu.cims.result.Result;
import com.dhu.cims.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;
@RestController
public class RegisterController {
    @Autowired
    private UserService userService;
    // 注册
    @CrossOrigin
    @PostMapping(value = "api/register")
    public Result register(@RequestBody User requestUser){
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);
        if(userService.findByUsername(username) == null){
            User user = new User();
            user.setUsername(username);
            user.setPassword(requestUser.getPassword());
            userService.insertUser(user);
            return new Result(200);
        }else{
            return new Result(400);
        }
    }
}

package com.dhu.cims.controller;
import com.dhu.cims.domain.User;
import com.dhu.cims.result.Result;
import com.dhu.cims.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;
import javax.servlet.http.HttpSession;
@RestController
public class LoginController {
    @Autowired
    private UserService userService;
    // 登录
    @CrossOrigin
    @PostMapping(value = "api/login")
    public Result login(@RequestBody User requestUser,HttpSession session){
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);
        //通过用户名和密码寻找用户
        User user = userService.findByUsernameAndPassword(username, requestUser.getPassword());
        if(null == user){
            return new Result(400);
        }else {
            session.setAttribute("user",user);
            return new Result(200);
        }
    }
}

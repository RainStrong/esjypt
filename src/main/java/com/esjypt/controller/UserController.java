package com.esjypt.controller;

import com.esjypt.model.TbUser;
import com.esjypt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:rain
 * @Date:
 */

@RestController
@RequestMapping("/testBoot")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("getUser/{id}")
    public TbUser GetUser(@PathVariable int id){
        return userService.selectByExample(id);
    }
}

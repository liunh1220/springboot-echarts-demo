package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by liulanhua on 2018/9/25.
 */
@RestController
public class UserController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @RequestMapping(value="user/countUserCreateTimeByMonth",method = RequestMethod.GET)
    public ModelAndView findUser(ModelAndView model) throws Exception {

        String  recordStr = "{\"month_4\":2,\"month_6\":1,\"month_5\":4,\"month_8\":1,\"month_7\":2,\"month_9\":1}";
        JSONObject record = JSONObject.parseObject(recordStr);
        System.out.println("=============================================================");
        System.out.println(record);

        model.addObject("users", record);
        model.setViewName("user");
        return model;
    }





}

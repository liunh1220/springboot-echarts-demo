package com.example.demo.controller;

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
public class IndexController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @RequestMapping(value="",method = RequestMethod.GET)
    public ModelAndView index(ModelAndView mv) throws Exception {
        mv.addObject("record", "this is echarts index page");
        mv.setViewName("index");
        return mv;
    }






}

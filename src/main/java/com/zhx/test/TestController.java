package com.zhx.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by mulder on 2015/6/16.
 */
@Controller
@RequestMapping("/test")
public class TestController {


    @RequestMapping("/showtest.do")
    public ModelAndView showtest(ModelAndView modelAndView){
        modelAndView.setViewName("test/testindex");
        return modelAndView;
    }

}

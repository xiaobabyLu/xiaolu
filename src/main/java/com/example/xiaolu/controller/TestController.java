package com.example.xiaolu.controller;

import com.example.xiaolu.service.UserService;
import com.example.xiaolu.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import java.util.Date;
import java.util.Map;


/**
 * @author Lu Yufeng
 * @date 2018/11/28 下午4:38
 */
@Controller
@EnableAutoConfiguration
public class TestController {

    @Autowired
    private UserService userService;

    private String hello = "Hello Jsp";

    @ResponseBody
    @GetMapping(value = "/hello")
    public String SayYes(){
        return "this is your first time to using Spring Boot!";
    }

    @RequestMapping(value={"/","/index"})
    public String index(Map<String,Object> model){
        model.put("time",new Date());
        model.put("message","第一次测试更新");

        return "index";
    }

    @RequestMapping("/page1")
    public ModelAndView page1(){
        // 页面位置 /WEB-INF/jsp/page/page.jsp
        ModelAndView mav = new ModelAndView("page/page1");
        mav.addObject("content", hello);
        return mav;
    }

    @ResponseBody
    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    public UserVO getUser(Long id){
        UserVO userVO = new UserVO();
        userVO = userService.getUSer(id);
        return userVO;
    }

    @RequestMapping("/test")
    public String test(ModelMap map){
        map.put("userName","小李");
        map.put("userAge",18);
        return "test";
    }



}

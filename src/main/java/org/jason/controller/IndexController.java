package org.jason.controller;

import org.jason.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * //TODO
 *
 * @author: linhj
 * @Date: 2019/12/24 23:08
 */
@Controller
public class IndexController {

    @Autowired
    private UserService userService;

    //首页
    @RequestMapping(value = {"/", "/index"})
    public String index() {
        System.out.println("index");
        return "hello";
    }

    @RequestMapping(value = "simpleHtml", method = RequestMethod.GET)
    public String simpleHtml() {
        return "redirect:/html/simple.html";
    }

     //登录接口，表单提交接口
    @RequestMapping("/login")
    public String login(String userName, String pwd, ModelMap modelMap) {
        boolean flag = false;
        try {
            flag = userService.login(userName, pwd);
        } catch (Exception e) {
            modelMap.put("msg", e.getMessage());
            return "redirect:failPage";
        }
        return flag ? "redirect://http://www.baidu.com" : "redirect:failPage";
    }

    @RequestMapping("successPage")
    public String successPage() {
        return "success";
    }

    @RequestMapping("failPage")
    public String failPage(String msg, ModelMap map) {
        map.put("msg", msg);
        return "fail";
    }

    //登录接口，表单提交接口
   /* @RequestMapping("/login")
    public String login(String userName, String pwd, ModelMap modelMap) {
        boolean flag = false;
        try {
            flag = userService.login(userName, pwd);
        } catch (Exception e) {
            modelMap.put("msg", e.getMessage());
            return "fail";
        }
        return flag ? "success" : "fail";
    }*/

    /*//登录接口，表单提交接口
    @RequestMapping("/login")
    public String login(String userName, String pwd, ModelMap modelMap) {
        boolean flag = false;
        try {
            flag = userService.login(userName, pwd);
        } catch (Exception e) {
            modelMap.put("msg", e.getMessage());
            return "redirect:fail.jsp?msg=";
        }
        return flag ? "redirect:success.jsp" : "redirect:fail.jsp";
    }*/



}
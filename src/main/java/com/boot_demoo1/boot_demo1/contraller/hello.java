package com.boot_demoo1.boot_demo1.contraller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * className:hello
 * Package:com.boot.boot_demo.contraller
 * Description:
 * Date:2020/1/7 17:22
 * Author:lym
 **/
//注解的作用：会自动扫描当前类作为一个spring的bean进行管理
// 同时识别为一个contraller(允许此类接受前端的请求)
@Controller
public class hello {
    //？？？
    @GetMapping("/hello")
    //第一个拿值，第二个存值，第三个将内容显示出来，model为内置的一个类
    public String hello(@RequestParam(name="name") String name, Model model){
        //key-value的形式向前端传递，第一个为名，后一个为参数值，上边第二个参数值。
        model.addAttribute("name",name);
        //回去resources下的temp..中找同名html文件，渲染成网页
        return "hello";
    }
}

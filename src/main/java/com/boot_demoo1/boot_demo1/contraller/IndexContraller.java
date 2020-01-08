package com.boot_demoo1.boot_demo1.contraller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * className:IndexContraller
 * Package:com.boot_demoo1.boot_demo1.contraller
 * Description:
 * Date:2020/1/8 15:40
 * Author:lym
 **/
@Controller
public class IndexContraller {
    //"/"表示根目录，默认直接去index模板下，也就是说访问地址为http://localhost8080
    @GetMapping("/")
    public String Index(){
        return "index";
    }
}

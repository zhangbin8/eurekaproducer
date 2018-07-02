package com.yhouse.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class TestRestful {



    @RequestMapping("/getClientName")
    public Object home(HttpServletRequest httpRequest){
        System.out.println(httpRequest.getRequestURL());
        Map<String,String> map = new HashMap<>();
        map.put("cname","client1");
        map.put("服务端端口",httpRequest.getLocalPort()+"");
        return map;
    }
}

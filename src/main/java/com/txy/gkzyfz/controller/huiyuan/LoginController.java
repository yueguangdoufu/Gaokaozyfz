package com.txy.gkzyfz.controller.huiyuan;

import com.txy.gkzyfz.pojo.Huiyuan;
import com.txy.gkzyfz.service.huiyuan.HuiyuanService;
import com.txy.gkzyfz.service.huiyuan.LoginService;
import com.txy.gkzyfz.test.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/login")
    public Map<String,String> login(@RequestBody Map<String,String> map){
        Huiyuan huiyuan;
        huiyuan = loginService.selectByUsername(map.get("empUser"));
//        System.out.println(MD5Util.encode(map.get("empPass"),map.get("empUser")));
//        System.out.println(huiyuan.getHpassword());
        if(huiyuan != null){
            if (MD5Util.encode(map.get("empPass"),map.get("empUser")).equals(huiyuan.getHpassword()) ){
                map.put("Status","ok");
                map.put("role","会员");
                map.put("empPass",MD5Util.encode(map.get("empPass"),map.get("empUser")));
                map.put("wenli",huiyuan.getHwenli());
                map.put("empId",huiyuan.getHid());
                map.put("fenshu", String.valueOf(huiyuan.getHfenshu()));
                map.put("Text","登录成功!");
            }else {
                System.out.println("用户名/密码不匹配！");
                map.put("Status","error");
                map.put("Text","登录失败!用户名或者密码错误!");
            }
        }else {
            System.out.println("账户不存在！");
            map.put("Status","error");
            map.put("Text","登录失败!账户不存在!");
        }
        return map;
    }
}

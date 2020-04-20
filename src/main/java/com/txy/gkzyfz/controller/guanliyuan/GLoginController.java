package com.txy.gkzyfz.controller.guanliyuan;

import com.txy.gkzyfz.pojo.Guanliyuan;
import com.txy.gkzyfz.pojo.Huiyuan;
import com.txy.gkzyfz.service.guanliyuan.GLoginService;
import com.txy.gkzyfz.service.huiyuan.HuiyuanService;
import com.txy.gkzyfz.service.huiyuan.LoginService;
import com.txy.gkzyfz.test.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class GLoginController {

    @Autowired
    private GLoginService gLoginService;

    @RequestMapping(value = "/login_g")
    public Map<String,String> gLogin(@RequestBody Map<String,String> map){
        Guanliyuan guanliyuan;
        guanliyuan = gLoginService.selectByUsername(map.get("empUser"));

        if(guanliyuan != null){
            if (MD5Util.encode(map.get("empPass"),map.get("empUser")).equals(guanliyuan.getGpassword())){
                map.put("Status","ok");
                map.put("empPass",MD5Util.encode(map.get("empPass"),map.get("empUser")));
                map.put("role","管理员");
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

package com.txy.gkzyfz.controller.huiyuan;

import com.txy.gkzyfz.pojo.Huiyuan;
import com.txy.gkzyfz.service.huiyuan.HuiyuanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.Map;

@RestController
public class HuiyuanController {

    @Autowired
    private HuiyuanService huiyuanService;

    @RequestMapping(value = "/update_huiyuan")
    public Map<String,String> updateHuiyuan(@RequestBody Map<String,String> map){
        return huiyuanService.updateHuiyuan(map);
    }

    @RequestMapping(value = "/insert_huiyuan")
    public Map<String,String> insertHuiyuan(@RequestBody Map<String,String> map) throws ParseException {
        return huiyuanService.insertHuiyuan(map);
    }
}

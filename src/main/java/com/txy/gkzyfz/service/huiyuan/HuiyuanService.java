package com.txy.gkzyfz.service.huiyuan;

import com.txy.gkzyfz.pojo.Huiyuan;
import com.txy.gkzyfz.pojo.HuiyuanMapper;
import com.txy.gkzyfz.pojo.Xuexiao;
import com.txy.gkzyfz.test.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;
import java.util.UUID;

@Service
@Transactional
public class HuiyuanService {

    @Autowired
    private HuiyuanMapper huiyuanMapper;

    public Map<String ,String> insertHuiyuan(Map<String,String> map){
        Huiyuan huiyuan = new Huiyuan();

        huiyuan.setHid(UUID.randomUUID().toString());
        huiyuan.setHfenshu(Integer.valueOf(map.get("fenshu")));
        huiyuan.setHpassword(MD5Util.encode(map.get("empPass"),map.get("empUser")));
        huiyuan.setHusername(map.get("empUser"));
        huiyuan.setHwenli(map.get("wenli"));

        huiyuanMapper.insert(huiyuan);

        map.put("Status","ok");
        map.put("Text","插入数据成功");
        map.put("empId",huiyuan.getHid());
        return map;
    }

    public Map<String,String> updateHuiyuan(Map<String,String> map){
        System.out.println("更新的 = "+map);

        Huiyuan huiyuan;

        huiyuan = huiyuanMapper.selectByPrimaryKey(map.get("empId"));

        huiyuan.setHfenshu(Integer.valueOf(map.get("fenshu")));
        huiyuan.setHname(map.get("empName"));
        huiyuan.setHpassword(MD5Util.encode(map.get("empPass"),map.get("empUser")));
        huiyuan.setHusername(map.get("empUser"));
        huiyuan.setHwenli(map.get("wenli"));

        huiyuanMapper.updateByPrimaryKeySelective(huiyuan);

        map.put("Status","ok");
        map.put("Text","修改数据成功");
        return map;
    }

}

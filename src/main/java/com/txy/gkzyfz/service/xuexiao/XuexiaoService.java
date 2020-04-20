package com.txy.gkzyfz.service.xuexiao;

import com.txy.gkzyfz.pojo.XuexiaoMapper;
import com.txy.gkzyfz.pojo.Xuexiao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class XuexiaoService {

    @Autowired
    private XuexiaoMapper xuexiaoMapper;

    public List<Xuexiao> selectXuexiao(){
        return xuexiaoMapper.selectXuexiao();
    }

    public List<Xuexiao> selectXuexiaoOrderDiqu(){return xuexiaoMapper.selectXuexiaoOrderDiqu();}

    public Map<String,String> updateXuexiao(Map<String,String> map){
        System.out.println("更新的 = "+map);

        Xuexiao xuexiao;

        xuexiao = xuexiaoMapper.selectByPrimaryKey(Integer.valueOf(map.get("xid")));

        xuexiao.setXdiqu(map.get("xdiqu"));
        xuexiao.setXleixing(map.get("xleixing"));
        xuexiao.setXlhigh(Integer.valueOf(map.get("xlhigh")));
        xuexiao.setXlike(map.get("xlike"));
        xuexiao.setXllow(Integer.valueOf(map.get("xllow")));
        xuexiao.setXname(map.get("xname"));
        xuexiao.setXwenke(map.get("xwenke"));
        xuexiao.setXwhigh(Integer.valueOf(map.get("xwhigh")));
        xuexiao.setXwlow(Integer.valueOf(map.get("xwlow")));

        xuexiaoMapper.updateByPrimaryKeySelective(xuexiao);

        map.put("Status","ok");
        map.put("Text","插入数据成功");
        return map;
    }

    public Map<String,String> insertXuexiao(Map<String,String> map) throws ParseException {
        Xuexiao xueXiao = new Xuexiao();

        xueXiao.setXwlow(Integer.valueOf(map.get("xwlow")));
        xueXiao.setXwhigh(Integer.valueOf(map.get("xwhigh")));
        xueXiao.setXwenke(map.get("xwenke"));
        xueXiao.setXname(map.get("xname"));
        xueXiao.setXllow(Integer.valueOf(map.get("xllow")));
        xueXiao.setXleixing(map.get("xleixing"));
        xueXiao.setXdiqu(map.get("xdiqu"));
        xueXiao.setXlike(map.get("xlike"));
        xueXiao.setXlhigh(Integer.valueOf(map.get("xlhigh")));
        xueXiao.setXid(Integer.valueOf(map.get("xid")));

        xuexiaoMapper.insert(xueXiao);

        map.put("Status","ok");
        map.put("Text","插入数据成功");
        map.put("empId",xueXiao.getXid().toString());
        return map;
    }

    public Map<String,String> deleteXuexiao(Map<String,String> map){
        xuexiaoMapper.deleteByPrimaryKey(Integer.valueOf(map.get("empId")));

        map.put("Status","ok");
        map.put("Text","插入数据成功");
        return map;
    }

    public List<Xuexiao> selectByName(String name) throws UnsupportedEncodingException {
        String decodeJson = URLDecoder.decode(name,"UTF-8");
        decodeJson = decodeJson.substring(0,decodeJson.length()-1);
        System.out.println("学校:"+decodeJson);
        String s = "%";
        for (int i = 0; i < decodeJson.length(); i++) {
            s = s + decodeJson.charAt(i) + "%";
        }
        System.out.println(s);
        return xuexiaoMapper.selectByName(s);
    }

    public List<Xuexiao> selectByDiqu(String diqu) throws UnsupportedEncodingException {
        String decodeJson = URLDecoder.decode(diqu,"UTF-8");
        decodeJson = decodeJson.substring(0,decodeJson.length()-1);
        System.out.println("地区："+decodeJson);
        return xuexiaoMapper.selectByDiqu(decodeJson);
    }

    public List<Xuexiao> selectByLeixing(String leixing) throws UnsupportedEncodingException {
        String decodeJson = URLDecoder.decode(leixing,"UTF-8");
        decodeJson = decodeJson.substring(0,decodeJson.length()-1);
        return xuexiaoMapper.selectByLeixing(decodeJson);
    }

    public List<Xuexiao> selectByWenfen(String wenfen) throws UnsupportedEncodingException {
        String decodeJson = URLDecoder.decode(wenfen,"UTF-8");
        decodeJson = decodeJson.substring(0,decodeJson.length()-1);
        return xuexiaoMapper.selectByWenfen(Integer.valueOf(decodeJson));
    }

    public List<Xuexiao> selectByLifen(String lifen) throws UnsupportedEncodingException {
        String decodeJson = URLDecoder.decode(lifen,"UTF-8");
        decodeJson = decodeJson.substring(0,decodeJson.length()-1);
        return xuexiaoMapper.selectByLifen(Integer.valueOf(decodeJson));
    }



    public List<Xuexiao> selectZhongdin(){
        return xuexiaoMapper.selectZhongdian();
    }

    public List<Xuexiao> selectPutong(){
        return xuexiaoMapper.selectPutong();
    }

    public List<Xuexiao> selectQita(){
        return xuexiaoMapper.selectQita();
    }
}

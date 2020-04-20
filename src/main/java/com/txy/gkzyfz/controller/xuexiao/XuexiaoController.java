package com.txy.gkzyfz.controller.xuexiao;

import com.txy.gkzyfz.pojo.Xuexiao;
import com.txy.gkzyfz.service.xuexiao.XuexiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

@RestController
public class XuexiaoController {

    @Autowired
    private XuexiaoService xuexiaoService;

    @RequestMapping(value = "/select_xuexiao")
    public List<Xuexiao> selectXuexiao(){
        return xuexiaoService.selectXuexiao();
    }

    @RequestMapping(value = "/select_xuexiao_orderdiqu")
    public List<Xuexiao> selectXuexiaoOrderDiqu(){
        return xuexiaoService.selectXuexiaoOrderDiqu();
    }

    @RequestMapping(value = "/select_xuexiao_name")
    public List<Xuexiao> selectByName(@RequestBody String name) throws UnsupportedEncodingException {
        return xuexiaoService.selectByName(name);
    }

    @RequestMapping(value = "/select_xuexiao_leixing")
    public List<Xuexiao> selectByLeixing(@RequestBody String leixing) throws UnsupportedEncodingException {
        return xuexiaoService.selectByLeixing(leixing);
    }

    @RequestMapping(value = "/select_xuexiao_diqu")
    public List<Xuexiao> selectByDiqu(@RequestBody String diqu) throws UnsupportedEncodingException {
        return xuexiaoService.selectByDiqu(diqu);
    }

    @RequestMapping(value = "/select_xuexiao_wenfen")
    public List<Xuexiao> selectByWenfen(@RequestBody String wenfen) throws UnsupportedEncodingException {
        return xuexiaoService.selectByWenfen(wenfen);
    }

    @RequestMapping(value = "/select_xuexiao_lifen")
    public List<Xuexiao> selectByLifen(@RequestBody String lifen) throws UnsupportedEncodingException {
        return xuexiaoService.selectByLifen(lifen);
    }

    @RequestMapping(value = "/select_zhongdian")
    public List<Xuexiao> selectZhongdian(){
        return xuexiaoService.selectZhongdin();
    }

    @RequestMapping(value = "/select_putong")
    public List<Xuexiao> selectPutong(){
        return xuexiaoService.selectPutong();
    }

    @RequestMapping(value = "/select_Qita")
    public List<Xuexiao> selectQita(){
        return xuexiaoService.selectQita();
    }

    @RequestMapping(value = "/update_xuexiao")
    public Map<String,String> updateXuexiao(@RequestBody Map<String,String> map){
        return xuexiaoService.updateXuexiao(map);
    }

    @RequestMapping(value = "/insert_xuexiao")
    public Map<String,String> insertXuexiao(@RequestBody Map<String,String> map) throws ParseException {
        return xuexiaoService.insertXuexiao(map);
    }

    @RequestMapping(value = "/delete_xuexiao")
    public Map<String,String> deleteXuexiao(@RequestBody Map<String,String> map){
        return xuexiaoService.deleteXuexiao(map);
    }
}

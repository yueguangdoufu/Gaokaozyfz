package com.txy.gkzyfz.controller.xuexiao;

import com.txy.gkzyfz.pojo.Xuexiao;
import com.txy.gkzyfz.service.xuexiao.XuexiaoFenleiService;
import com.txy.gkzyfz.service.xuexiao.XuexiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.util.List;

@RestController
public class XuexiaoFenleiController {

    @Autowired
    private XuexiaoFenleiService xuexiaoService;

    @RequestMapping(value = "/select_xuexiao_name_gd")
    public List<Xuexiao> selectByNameGD(@RequestBody String name) throws UnsupportedEncodingException {
        return xuexiaoService.selectByNameGD(name);
    }

    @RequestMapping(value = "/select_xuexiao_diqu_gd")
    public List<Xuexiao> selectByDiquGD(@RequestBody String diqu) throws UnsupportedEncodingException {
        return xuexiaoService.selectByDiquGD(diqu);
    }

    @RequestMapping(value = "/select_xuexiao_wenfen_gd")
    public List<Xuexiao> selectByWenfenGD(@RequestBody String wenfen) throws UnsupportedEncodingException {
        return xuexiaoService.selectByWenfenGD(wenfen);
    }

    @RequestMapping(value = "/select_xuexiao_lifen_gd")
    public List<Xuexiao> selectByLifen(@RequestBody String lifen) throws UnsupportedEncodingException {
        return xuexiaoService.selectByLifenGD(lifen);
    }

    @RequestMapping(value = "/select_xuexiao_name_pt")
    public List<Xuexiao> selectByNamePT(@RequestBody String name) throws UnsupportedEncodingException {
        return xuexiaoService.selectByNamePT(name);
    }

    @RequestMapping(value = "/select_xuexiao_diqu_pt")
    public List<Xuexiao> selectByDiquPT(@RequestBody String diqu) throws UnsupportedEncodingException {
        return xuexiaoService.selectByDiquPT(diqu);
    }

    @RequestMapping(value = "/select_xuexiao_wenfen_pt")
    public List<Xuexiao> selectByWenfenPT(@RequestBody String wenfen) throws UnsupportedEncodingException {
        return xuexiaoService.selectByWenfenPT(wenfen);
    }

    @RequestMapping(value = "/select_xuexiao_lifen_pt")
    public List<Xuexiao> selectByLifenPT(@RequestBody String lifen) throws UnsupportedEncodingException {
        return xuexiaoService.selectByLifenPT(lifen);
    }

    @RequestMapping(value = "/select_xuexiao_name_qt")
    public List<Xuexiao> selectByNameQT(@RequestBody String name) throws UnsupportedEncodingException {
        return xuexiaoService.selectByNameQT(name);
    }

    @RequestMapping(value = "/select_xuexiao_diqu_qt")
    public List<Xuexiao> selectByDiquQT(@RequestBody String diqu) throws UnsupportedEncodingException {
        return xuexiaoService.selectByDiquQT(diqu);
    }

    @RequestMapping(value = "/select_xuexiao_wenfen_qt")
    public List<Xuexiao> selectByWenfenQT(@RequestBody String wenfen) throws UnsupportedEncodingException {
        return xuexiaoService.selectByWenfenQT(wenfen);
    }

    @RequestMapping(value = "/select_xuexiao_lifen_qt")
    public List<Xuexiao> selectByLifenQT(@RequestBody String lifen) throws UnsupportedEncodingException {
        return xuexiaoService.selectByLifenQT(lifen);
    }
}

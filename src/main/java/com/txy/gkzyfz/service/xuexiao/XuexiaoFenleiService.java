package com.txy.gkzyfz.service.xuexiao;

import com.txy.gkzyfz.pojo.Xuexiao;
import com.txy.gkzyfz.pojo.XuexiaoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

@Service
@Transactional
public class XuexiaoFenleiService {

    @Autowired
    private XuexiaoMapper xuexiaoMapper;

    public List<Xuexiao> selectByNameGD(String name) throws UnsupportedEncodingException {
        String decodeJson = URLDecoder.decode(name,"UTF-8");
        decodeJson = decodeJson.substring(0,decodeJson.length()-1);
        System.out.println("学校:"+decodeJson);
        String s = "%";
        for (int i = 0; i < decodeJson.length(); i++) {
            s = s + decodeJson.charAt(i) + "%";
        }
        System.out.println(s);
        return xuexiaoMapper.selectByNameGD(s);
    }

    public List<Xuexiao> selectByDiquGD(String diqu) throws UnsupportedEncodingException {
        String decodeJson = URLDecoder.decode(diqu,"UTF-8");
        decodeJson = decodeJson.substring(0,decodeJson.length()-1);
        System.out.println("地区："+decodeJson);
        return xuexiaoMapper.selectByDiquGD(decodeJson);
    }

    public List<Xuexiao> selectByWenfenGD(String wenfen) throws UnsupportedEncodingException {
        String decodeJson = URLDecoder.decode(wenfen,"UTF-8");
        decodeJson = decodeJson.substring(0,decodeJson.length()-1);
        return xuexiaoMapper.selectByWenfenGD(Integer.valueOf(decodeJson));
    }

    public List<Xuexiao> selectByLifenGD(String lifen) throws UnsupportedEncodingException {
        String decodeJson = URLDecoder.decode(lifen,"UTF-8");
        decodeJson = decodeJson.substring(0,decodeJson.length()-1);
        return xuexiaoMapper.selectByLifenGD(Integer.valueOf(decodeJson));
    }

    public List<Xuexiao> selectByNamePT(String name) throws UnsupportedEncodingException {
        String decodeJson = URLDecoder.decode(name,"UTF-8");
        decodeJson = decodeJson.substring(0,decodeJson.length()-1);
        System.out.println("学校:"+decodeJson);
        String s = "%";
        for (int i = 0; i < decodeJson.length(); i++) {
            s = s + decodeJson.charAt(i) + "%";
        }
        System.out.println(s);
        return xuexiaoMapper.selectByNamePT(s);
    }

    public List<Xuexiao> selectByDiquPT(String diqu) throws UnsupportedEncodingException {
        String decodeJson = URLDecoder.decode(diqu,"UTF-8");
        decodeJson = decodeJson.substring(0,decodeJson.length()-1);
        System.out.println("地区："+decodeJson);
        return xuexiaoMapper.selectByDiquPT(decodeJson);
    }

    public List<Xuexiao> selectByWenfenPT(String wenfen) throws UnsupportedEncodingException {
        String decodeJson = URLDecoder.decode(wenfen,"UTF-8");
        decodeJson = decodeJson.substring(0,decodeJson.length()-1);
        return xuexiaoMapper.selectByWenfenPT(Integer.valueOf(decodeJson));
    }

    public List<Xuexiao> selectByLifenPT(String lifen) throws UnsupportedEncodingException {
        String decodeJson = URLDecoder.decode(lifen,"UTF-8");
        decodeJson = decodeJson.substring(0,decodeJson.length()-1);
        return xuexiaoMapper.selectByLifenPT(Integer.valueOf(decodeJson));
    }

    public List<Xuexiao> selectByNameQT(String name) throws UnsupportedEncodingException {
        String decodeJson = URLDecoder.decode(name,"UTF-8");
        decodeJson = decodeJson.substring(0,decodeJson.length()-1);
        System.out.println("学校:"+decodeJson);
        String s = "%";
        for (int i = 0; i < decodeJson.length(); i++) {
            s = s + decodeJson.charAt(i) + "%";
        }
        System.out.println(s);
        return xuexiaoMapper.selectByNameQT(s);
    }

    public List<Xuexiao> selectByDiquQT(String diqu) throws UnsupportedEncodingException {
        String decodeJson = URLDecoder.decode(diqu,"UTF-8");
        decodeJson = decodeJson.substring(0,decodeJson.length()-1);
        System.out.println("地区："+decodeJson);
        return xuexiaoMapper.selectByDiquQT(decodeJson);
    }

    public List<Xuexiao> selectByWenfenQT(String wenfen) throws UnsupportedEncodingException {
        String decodeJson = URLDecoder.decode(wenfen,"UTF-8");
        decodeJson = decodeJson.substring(0,decodeJson.length()-1);
        return xuexiaoMapper.selectByWenfenQT(Integer.valueOf(decodeJson));
    }

    public List<Xuexiao> selectByLifenQT(String lifen) throws UnsupportedEncodingException {
        String decodeJson = URLDecoder.decode(lifen,"UTF-8");
        decodeJson = decodeJson.substring(0,decodeJson.length()-1);
        return xuexiaoMapper.selectByLifenQT(Integer.valueOf(decodeJson));
    }


}

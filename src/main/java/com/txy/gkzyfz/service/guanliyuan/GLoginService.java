package com.txy.gkzyfz.service.guanliyuan;

import com.txy.gkzyfz.pojo.Guanliyuan;
import com.txy.gkzyfz.pojo.GuanliyuanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GLoginService {

    @Autowired
    GuanliyuanMapper guanliyuanMapper;

    public Guanliyuan selectByUsername(String username){
        return guanliyuanMapper.selectByUsername(username);
    }
}

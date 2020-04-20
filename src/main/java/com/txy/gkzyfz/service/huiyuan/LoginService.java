package com.txy.gkzyfz.service.huiyuan;

import com.txy.gkzyfz.pojo.Huiyuan;
import com.txy.gkzyfz.pojo.HuiyuanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LoginService {

    @Autowired
    private HuiyuanMapper huiyuanMapper;

    public Huiyuan selectByUsername(String username){
        return huiyuanMapper.selectByUsername(username);
    }
}

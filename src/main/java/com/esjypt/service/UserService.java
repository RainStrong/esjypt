package com.esjypt.service;

import com.esjypt.mapper.TbUserMapper;
import com.esjypt.model.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Author:rain
 * @Date:
 */
@Service
public class UserService {
    @Autowired
    TbUserMapper tbUserMapper;
    public TbUser selectByExample(int id){
        return tbUserMapper.Sel(id);
    }
}

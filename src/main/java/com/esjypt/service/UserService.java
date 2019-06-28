package com.esjypt.service;

import com.esjypt.mapper.TbUserMapper;
import com.esjypt.model.TbUser;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Author:rain
 * @Date:
 */
@Service
public class UserService {

    private static final Logger logger = Logger.getLogger(UserService.class);

    @Autowired
    TbUserMapper tbUserMapper;

    public TbUser selectByExample(int id) {
        String str = null;
        try {
            str.equals("");
        } catch (Exception e) {

            logger.error("获取列表失败，", e);
            throw e;
        }

//        tbUserMapper.Sel(id);
        return null;

    }
}

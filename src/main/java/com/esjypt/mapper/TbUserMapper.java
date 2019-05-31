package com.esjypt.mapper;

import com.esjypt.model.TbUser;
import org.springframework.stereotype.Repository;

@Repository
public interface TbUserMapper {
    int insert(TbUser record);

    int insertSelective(TbUser record);

    TbUser Sel(int id);
}
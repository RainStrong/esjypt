package com.esjypt.mapper;

import com.esjypt.model.TbBooks;

public interface TbBooksMapper {
    int deleteByPrimaryKey(String bookId);

    int insert(TbBooks record);

    int insertSelective(TbBooks record);

    TbBooks selectByPrimaryKey(String bookId);

    int updateByPrimaryKeySelective(TbBooks record);

    int updateByPrimaryKey(TbBooks record);
}
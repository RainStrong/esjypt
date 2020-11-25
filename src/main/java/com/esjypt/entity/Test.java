package com.esjypt.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.Data;

@Table(name="test")
@Data
public class Test {

    @Column(name="id",type= MySqlTypeConstant.INT,isKey = true,isAutoIncrement = true)
    private String id;

    @Column(name="value",type = MySqlTypeConstant.VARCHAR)
    private String value;

    @Column(name="comment",type = MySqlTypeConstant.VARCHAR)
    private String comment;

}
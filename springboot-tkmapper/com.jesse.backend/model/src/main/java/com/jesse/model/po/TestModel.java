package com.jesse.model.po;

import lombok.Data;
import lombok.experimental.Accessors;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "test")
@Accessors(chain = true)
public class TestModel {

    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;

    private String name;

    private Integer store;

    private Date utime;

    private Date ctime;

    private boolean isEnable;
}

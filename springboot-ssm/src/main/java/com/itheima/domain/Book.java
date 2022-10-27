package com.itheima.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
public class Book {
    private Integer id;
    private String name;
    private String type;
    private String description;
    private Integer count;
    @TableLogic(value = "0",delval = "1")
    private Integer deleted;
}

package com.itheima.domain;

import com.baomidou.mybatisplus.annotation.*;
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
    @Version
    private Integer version;
}

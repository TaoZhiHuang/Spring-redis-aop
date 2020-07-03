package com.hzt.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * sys_user
 * @author 
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 地址
     */
    private String address;

    /**
     * 生日
     */
    private Date birth;

    /**
     * 爱好
     */
    private String hobby;

    private static final long serialVersionUID = 1L;
}
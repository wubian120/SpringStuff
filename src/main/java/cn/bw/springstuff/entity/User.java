package cn.bw.springstuff.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @auther: bian.wu
 * @date: 2019/5/10 11:32
 */

@Data
public class User implements Serializable {

    private long id;
    private String name;
    private String code;
    private String dept;
    private String email;

}

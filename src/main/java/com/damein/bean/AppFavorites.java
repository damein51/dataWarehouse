package com.damein.bean;

import lombok.Data;

/**
 * @program: hadoop2
 * @description: 收藏
 * @author: lidongmin
 * @create: 2021-02-25 10:48
 */
@Data
public class AppFavorites {

    private int id;//主键
    private int course_id;//商品id
    private int userid;//用户ID
    private String add_time;//创建时间
}
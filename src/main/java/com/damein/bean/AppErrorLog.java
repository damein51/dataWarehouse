package com.damein.bean;

import lombok.Data;

/**
 * @program: hadoop2
 * @description:
 * @author: lidongmin
 * @create: 2021-02-25 10:34
 */
@Data
public class AppErrorLog {
    private String errorBrief;    //错误摘要
    private String errorDetail;   //错误详情
}
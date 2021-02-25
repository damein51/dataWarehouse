package com.damein.bean;

import lombok.Data;

/**
 * @program: hadoop2
 * @description: 用户后台活跃
 * @author: lidongmin
 * @create: 2021-02-25 10:48
 */
@Data
public class AppActive_background {
    private String active_source;//1=upgrade,2=download(下载),3=plugin_upgrade

}
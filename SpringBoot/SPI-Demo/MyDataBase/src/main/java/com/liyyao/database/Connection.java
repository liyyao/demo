package com.liyyao.database;


/**
 * SPI 定义的公共接口
 * 类似于JDBC中定义的规范
 */
public interface Connection {

    public String getUrl();
}

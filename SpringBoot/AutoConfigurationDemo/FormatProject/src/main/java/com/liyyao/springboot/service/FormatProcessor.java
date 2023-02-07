package com.liyyao.springboot.service;

public interface FormatProcessor {

    /**
     * 定义一个格式化的方法
     * @param object
     * @return
     * @param <T>
     */
    <T> String format(T object);
}

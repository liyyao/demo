package com.liyyao.springboot.service.impl;

import com.alibaba.fastjson.JSON;
import com.liyyao.springboot.service.FormatProcessor;

public class JsonFormatProcessor implements FormatProcessor {
    @Override
    public <T> String format(T object) {
        return "JsonFormatProcessor: " + JSON.toJSON(object);
    }
}

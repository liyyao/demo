package com.liyyao.springboot.service.impl;

import com.liyyao.springboot.service.FormatProcessor;

public class StringFormatProcessor implements FormatProcessor {
    @Override
    public <T> String format(T object) {
        return "StringFormatProcessor: " + object.toString();
    }
}

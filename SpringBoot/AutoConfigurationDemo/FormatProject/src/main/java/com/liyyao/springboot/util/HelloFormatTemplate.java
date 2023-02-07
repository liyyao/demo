package com.liyyao.springboot.util;

import com.liyyao.springboot.service.FormatProcessor;

public class HelloFormatTemplate {

    private FormatProcessor formatProcessor;

    public HelloFormatTemplate(FormatProcessor processor) {
        this.formatProcessor = processor;
    }

    public <T> String doFormat(T obj) {
        StringBuilder builder = new StringBuilder();
        builder.append("Execute format : ").append("<br>");
        builder.append("Object format result : ").append(formatProcessor.format(obj));
        return builder.toString();
    }
}

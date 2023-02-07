package com.liyyao.springboot.util;

import com.liyyao.springboot.properties.HelloProperties;
import com.liyyao.springboot.service.FormatProcessor;

public class HelloFormatTemplate {

    private FormatProcessor formatProcessor;

    private HelloProperties helloProperties;

    public HelloFormatTemplate(HelloProperties helloProperties, FormatProcessor processor) {
        this.formatProcessor = processor;
        this.helloProperties = helloProperties;
    }

    public <T> String doFormat(T obj) {
        StringBuilder builder = new StringBuilder();
        builder.append("Execute format : ").append("<br>");
        builder.append("HelloProperties : ").append(formatProcessor.format(helloProperties.getInfo())).append("<br>");
        builder.append("Object format result : ").append(formatProcessor.format(obj));
        return builder.toString();
    }
}

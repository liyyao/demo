package com.liyyao.mysql;

import com.liyyao.database.Connection;

public class MySqlConnection implements Connection {
    @Override
    public String getUrl() {
        System.out.println("mysql...");
        return null;
    }
}

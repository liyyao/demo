package com.liyyao.oracle;

import com.liyyao.database.Connection;

public class OracleConnection implements Connection {
    @Override
    public String getUrl() {
        System.out.println("oracle...");
        return null;
    }
}

package com.liyyao.spi;

import com.liyyao.database.Connection;

import java.util.Iterator;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        ServiceLoader<Connection> load = ServiceLoader.load(Connection.class);
        Iterator<Connection> iterator = load.iterator();
        while (iterator.hasNext()) {
            Connection con = iterator.next();
            con.getUrl();
        }
    }
}
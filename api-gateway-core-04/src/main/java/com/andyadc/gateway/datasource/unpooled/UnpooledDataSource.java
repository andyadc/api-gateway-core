package com.andyadc.gateway.datasource.unpooled;

import com.andyadc.gateway.datasource.Connection;
import com.andyadc.gateway.datasource.DataSource;

/**
 * 无池化的连接池
 */
public class UnpooledDataSource implements DataSource {

    @Override
    public Connection getConnection() {
        return null;
    }
}

package com.andyadc.gateway.datasource.unpooled;

import com.andyadc.gateway.datasource.DataSource;
import com.andyadc.gateway.datasource.DataSourceFactory;
import com.andyadc.gateway.session.Configuration;

public class UnpooledDataSourceFactory implements DataSourceFactory {

    protected UnpooledDataSource dataSource;

    public UnpooledDataSourceFactory() {
        this.dataSource = new UnpooledDataSource();
    }

    @Override
    public void setProperties(Configuration configuration, String uri) {

    }

    @Override
    public DataSource getDataSource() {
        return dataSource;
    }
}

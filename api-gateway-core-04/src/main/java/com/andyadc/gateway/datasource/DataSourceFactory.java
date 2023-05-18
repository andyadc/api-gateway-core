package com.andyadc.gateway.datasource;

import com.andyadc.gateway.session.Configuration;

/**
 * 数据源工厂
 */
public interface DataSourceFactory {

    void setProperties(Configuration configuration, String uri);

    DataSource getDataSource();
}

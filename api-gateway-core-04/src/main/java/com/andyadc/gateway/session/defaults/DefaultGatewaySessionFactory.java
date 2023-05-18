package com.andyadc.gateway.session.defaults;

import com.andyadc.gateway.session.Configuration;
import com.andyadc.gateway.session.GatewaySession;
import com.andyadc.gateway.session.GatewaySessionFactory;

/**
 * 默认网关会话工厂
 */
public class DefaultGatewaySessionFactory implements GatewaySessionFactory {

    private final Configuration configuration;

    public DefaultGatewaySessionFactory(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public GatewaySession openSession() {
        return new DefaultGatewaySession(configuration);
    }
}

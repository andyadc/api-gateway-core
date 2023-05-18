package com.andyadc.gateway.session;

import com.andyadc.gateway.bind.IGenericReference;

/**
 * 用户处理网关 HTTP 请求
 */
public interface GatewaySession {

    Object get(String uri, Object parameter);

    IGenericReference getMapper(String uri);

    Configuration getConfiguration();
}

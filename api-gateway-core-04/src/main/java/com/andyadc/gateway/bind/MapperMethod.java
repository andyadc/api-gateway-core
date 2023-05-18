package com.andyadc.gateway.bind;

import com.andyadc.gateway.mapping.HttpCommandType;
import com.andyadc.gateway.session.Configuration;
import com.andyadc.gateway.session.GatewaySession;

import java.lang.reflect.Method;

/**
 * 绑定调用方法
 */
public class MapperMethod {

    private final String uri;
    private final HttpCommandType command;

    public MapperMethod(String uri, Method method, Configuration configuration) {
        this.uri = uri;
        this.command = configuration.getHttpStatement(uri).getHttpCommandType();
    }

    public Object execute(GatewaySession session, Object args) {
        Object result = null;
        switch (command) {
            case GET:
                result = session.get(uri, args);
                break;
            case POST:
                break;
            case PUT:
                break;
            case DELETE:
                break;
            default:
                throw new RuntimeException("Unknown execution method for: " + command);
        }
        return result;
    }
}

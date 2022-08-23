package com.andyadc.gateway.bind;

import com.andyadc.gateway.session.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * 泛化调用注册器
 */
public class GenericReferenceRegistry {

    private final Configuration configuration;

    public GenericReferenceRegistry(Configuration configuration) {
        this.configuration = configuration;
    }

    // 泛化调用静态代理工厂
    private final Map<String, GenericReferenceProxyFactory> knownGenericReferences = new HashMap<>();

}

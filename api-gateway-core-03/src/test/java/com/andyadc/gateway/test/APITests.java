package com.andyadc.gateway.test;

import com.andyadc.gateway.session.Configuration;
import com.andyadc.gateway.session.GenericReferenceSessionFactoryBuilder;
import io.netty.channel.Channel;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Future;

public class APITests {

    private final Logger logger = LoggerFactory.getLogger(APITests.class);

    @Test
    public void test_GenericReference() throws Exception {
        Configuration configuration = new Configuration();
        configuration.addGenericReference("api-gateway-test",
                "cn.bugstack.gateway.rpc.IActivityBooth",
                "sayHi");

        GenericReferenceSessionFactoryBuilder builder = new GenericReferenceSessionFactoryBuilder();
        Future<Channel> future = builder.build(configuration);

        logger.info("服务启动完成 {}", future.get().id());

        Thread.sleep(Long.MAX_VALUE);
    }
}

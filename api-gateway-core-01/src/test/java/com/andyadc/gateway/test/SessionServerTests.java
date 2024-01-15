package com.andyadc.gateway.test;

import com.andyadc.gateway.SessionServer;
import io.netty.channel.Channel;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SessionServerTests {

    private final Logger logger = LoggerFactory.getLogger(SessionServerTests.class);

    @Test
    public void testSessionServer() throws Exception {
        SessionServer server = new SessionServer();

        Future<Channel> future = Executors.newFixedThreadPool(2).submit(server);
        Channel channel = future.get();

        if (null == channel) throw new RuntimeException("netty server start error channel is null");

        while (!channel.isActive()) {
            logger.info("NettyServer启动服务 ...");
            Thread.sleep(500);
        }
        logger.info("NettyServer启动服务完成 {}", channel.localAddress());

        Thread.sleep(Long.MAX_VALUE);
    }
}

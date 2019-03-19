package com.hdd.configuration;

import org.springframework.beans.factory.annotation.Value;


/**
 * Created by 格调 on 2018/12/20.
 */

public class JedisRedisConfigruration {

    @Value("${spring.redis.host}")
    private  String host;
    @Value("${spring.redis.password}")
    private  String password;
    @Value("${spring.redis.port}")
    private  int port;
    @Value("${spring.redis.jedis.pool.max-idle}")
    private int maxIdle;
    @Value("${spring.redis.jedis.pool.max-wait}")
    private long maxWaitMillis;
    @Value("${spring.redis.jedis.pool.max-active")
    private int maxActive;
    @Value("${spring.redis.jedis.pool.min-idle}")
    private long minIdle;

}

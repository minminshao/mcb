/*
 * Copyright 1998-2012 360buy.com All right reserved. This software is the confidential and proprietary information of
 * 360buy.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with 360buy.com.
 */
package com.xingzhe.framework.cache.redis.core;

import redis.clients.jedis.ShardedJedis;

/**
 * 类RedisCallback.java的实现描述：Redis的回调接口
 * 
 * @author liulin 2012-11-29 上午9:58:51
 */
public interface RedisCallback<T> {

    /**
     * Redis 命令回调方法。
     * 
     * @param jedis
     * @param key
     * @return
     */
    T doInRedis(ShardedJedis jedis);

}

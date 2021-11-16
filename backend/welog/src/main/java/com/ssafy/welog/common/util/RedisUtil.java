package com.ssafy.welog.common.util;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Component;

@Component
public class RedisUtil {

    private final RedisTemplate<String, Object> redisTemplate;
    private final RedisTemplate<String, Object> managementTemplate;

    RedisUtil(
        RedisTemplate<String, Object> redisTemplate,
        @Qualifier("managementTemplate") RedisTemplate<String, Object> managementTemplate
    ) {
        this.redisTemplate = redisTemplate;
        this.managementTemplate = managementTemplate;
    }

    public void set(String key, Object o, int minutes) {
        redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer(o.getClass()));
        redisTemplate.opsForValue().set(key, o, minutes, TimeUnit.MINUTES);
    }

    public Object get(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    public boolean delete(String key) {
        return redisTemplate.delete(key);
    }

    public boolean hasKey(String key) {
        return redisTemplate.hasKey(key);
    }

    public void setManagement(String key, Object o) {
        managementTemplate.setValueSerializer(new Jackson2JsonRedisSerializer(o.getClass()));
        managementTemplate.opsForValue().set(key, o);
    }

    public void setManagementVersionList(String key, String value) {
        managementTemplate.setValueSerializer(new StringRedisSerializer());
        managementTemplate.opsForList().rightPush(key, value);
    }

    public Object getManagement(String key) {
        return managementTemplate.opsForValue().get(key);
    }

    public List<String> getManagementVersionList(String key) {
        long size = managementTemplate.opsForList().size(key);
        List<Object> range = managementTemplate.opsForList().range(key, 0, size);
        List<String> collect = range.stream().map(o -> o.toString())
            .collect(Collectors.toList());
        return collect;
    }

    public boolean deleteManagement(String key) {
        return managementTemplate.delete(key);
    }

    public boolean hasKeyManagement(String key) {
        return managementTemplate.hasKey(key);
    }
}

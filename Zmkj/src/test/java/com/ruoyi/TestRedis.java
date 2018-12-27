package com.ruoyi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@Component
public class TestRedis
{
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Test
    public void set()
    {
        Integer id = 123456;

        redisTemplate.opsForValue().set("id", id);
        System.out.println(redisTemplate.opsForValue().get("id"));
    }
}
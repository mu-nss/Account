package com.example.account.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
@Slf4j
@RequiredArgsConstructor
public class RedisTestService {

    // private final 써야 @RequiredArgsConstructor 자동생성 됨
    private final RedissonClient redissonClient;

    public String getLock() {
        // redissonClient에 sampleLock이라는 이름의 락을 가져온다.
        RLock lock = redissonClient.getLock("sampleLock");

        try {
            boolean isLock = lock.tryLock(1, 5, TimeUnit.SECONDS);

            if(!isLock) {
                log.error("====== Lock acquisition failed ======");
                return "Lock failed";
            }
        } catch (Exception e) {
            log.error("Redis lock failed");
        }

        return "Lock success";
    }

}

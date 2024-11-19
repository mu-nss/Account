package com.example.account;

import lombok.experimental.UtilityClass;

@UtilityClass
public class NumberUtil {

    // 생성자 쓰지 못하게 막아주기 위해서
    // private NumberUtil() {} 을 작성하는데
    // 귀찮으니깐 @UtilityClass 어노테이션을 사용해서 자동 생성한다.

    public static Integer sum(Integer a,  Integer b) {
        return a + b;
    }

    public static Integer minus(Integer a,  Integer b) {
        return a - b;
    }
}

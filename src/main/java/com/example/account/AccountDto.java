package com.example.account;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@RequiredArgsConstructor // 빈을 생성자 주입받을 때
//@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class AccountDto {
    private String accountNumber;
    private String nickname;
    private LocalDateTime registeredAt;

    // @Data
    // 이거 하나만 적으면 @Getter, @Setter, @ToString을 따로 써주지 않아도 된다.
    // 하지만 toString()이 자동 생성되기 때문에 민감한 정보가 흘러 나갈 수 있기 때문에
    // 보안 문제가 발생하기 때문에 사용하지 않는다.

    public void log() {
        log.error("error is occurred.");
    }

}

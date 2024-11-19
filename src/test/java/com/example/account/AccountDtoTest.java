package com.example.account;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

class AccountDtoTest {

    @Test
    void accountDto() {
        // given
        // when
        // then

        // @AllArgsConstructor를 썼을 때 한번에 생성이 가능하다.
        AccountDto accountDto = new AccountDto(
                "accountNumber",
                "summer",
                LocalDateTime.now());

//        accountDto.setAccountNumber("accountNumber");
//        accountDto.setNickname("summer");

        System.out.println(accountDto.getAccountNumber());
        // toString()은 기본적으로 hashcode 값을 넣어서 보여준다.
        System.out.println(accountDto.toString());
     }
}
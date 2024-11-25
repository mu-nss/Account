package com.example.account.dto;

import com.example.account.domain.Account;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AccountDto {
    private Long userId;
    private String accountNumber;
    private Long balance;

    private LocalDateTime registerAt;
    private LocalDateTime unRegisteredAt;

    // 특정 엔티티에서 특정 Dto로 변환해주는
    // static 메서드를 생성하면
    // 가독성 높고 안전하면서 깔끔한 생성을 할 수 있음
    public static AccountDto fromEntity(Account account) {
        return AccountDto.builder()
                .userId(account.getAccountUser().getId())
                .accountNumber(account.getAccountNumber())
                .registerAt(account.getRegisteredAt())
                .unRegisteredAt(account.getUnRegisteredAt())
                .build();
    }
}

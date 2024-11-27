package com.example.account.dto;

import com.example.account.type.ErrorCode;
import lombok.*;

/**
 * 예외처리
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorResponse {
    private ErrorCode errorCode;
    private String errorMessage;
}

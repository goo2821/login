package com.bose.user.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorStatus {

  INVALID_EMAIL(101, "잘못된 이메일입니다."),
  INVALID_PASSWORD(102, "잘못된 비밀번호입니다."),
  EMAIL_IS_NOT_FOUND(103, "이메일이 존재하지 않습니다."),
  PASSWORD_IS_NOT_MATCHED(104, "비밀번호가 틀립니다."),
  ;

  private final int code;
  private final String message;

}

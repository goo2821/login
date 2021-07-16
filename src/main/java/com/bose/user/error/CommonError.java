package com.bose.user.error;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CommonError {

  private int code;
  private String message;

  public CommonError(ErrorStatus errorStatus) {
    this.code = errorStatus.getCode();
    this.message = errorStatus.getMessage();
  }

}

package com.bose.user.error;

import lombok.Getter;

@Getter
public class ErrorException extends RuntimeException {

  private final CommonError commonError;

  public ErrorException(ErrorStatus errorStatus) {
    this.commonError = new CommonError(errorStatus);
  }

}

package com.bose.user.domain.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum GenderType {

  MALE("남성"),
  FEMALE("여성");

  private final String type;

  public String getType() {
    return this.type;
  }

}

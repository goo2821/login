package com.bose.user.domain.user.vo;

import com.bose.user.domain.enums.GenderType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class userVo {

  private String email;
  private String name;
  private String password;
  private String registrationNumber;
  private String ci;
  private Integer age;
  private GenderType gender;

}

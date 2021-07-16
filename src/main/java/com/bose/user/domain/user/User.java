package com.bose.user.domain.user;

import com.bose.user.domain.enums.GenderType;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long userId;

  @Column
  private String email;

  @Column
  private String name;

  @Column
  private String password;

  @Column
  private String registrationNumber;

  @Column
  private String ci;

  @Column
  private Integer age;

  @Column
  private GenderType gender;

}

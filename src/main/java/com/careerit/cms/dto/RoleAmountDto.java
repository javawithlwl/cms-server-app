package com.careerit.cms.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RoleAmountDto {
  private String role;
  private double amount;

  public RoleAmountDto(String role, double amount) {
    this.role = role;
    this.amount = amount;
  }
}

package com.careerit.cms.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TeamAmountStatsDto {
  private String teamLabel;
  private double amount;

  public TeamAmountStatsDto(String teamLabel, double amount) {
    this.teamLabel = teamLabel;
    this.amount = amount;
  }
}

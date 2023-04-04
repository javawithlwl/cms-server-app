package com.careerit.cms.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PlayerDto {
    private Long id;
    private String name;
    private String role;
    private String teamName;
    private String teamLabel;
    private double amount;

  public PlayerDto(Long id, String name, String role, String teamName, String teamLabel, double amount) {
    this.id = id;
    this.name = name;
    this.role = role;
    this.teamName = teamName;
    this.teamLabel = teamLabel;
    this.amount = amount;
  }
}

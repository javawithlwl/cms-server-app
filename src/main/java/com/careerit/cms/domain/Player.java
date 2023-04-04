package com.careerit.cms.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "player")
@Getter
@Setter
public class Player {
      @Id
      private Long id;
      @Column(name = "name")
      private String name;
      @Column(name="role")
      private String role;
      @Column(name = "country")
      private String country;
      @Column(name="amount")
      private double amount;
      @ManyToOne
      @JoinColumn(name = "team_label",referencedColumnName = "team_label")
      private Team team;

}

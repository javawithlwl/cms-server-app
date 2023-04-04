package com.careerit.cms.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "team")
@Setter
@Getter
public class Team {
      @Id
      @Column(name = "team_label")
      private String teamLabel;
      @Column(name="name")
      private String name;
      @Column(name="captain")
      private String captain;

      @OneToMany(mappedBy = "team",fetch = FetchType.EAGER)
      private List<Player> players;
}

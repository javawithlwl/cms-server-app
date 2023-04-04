package com.careerit.cms;

import com.careerit.cms.domain.Team;
import com.careerit.cms.repo.TeamRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TeamRepoTest {
  @Autowired
  private TeamRepo teamRepo;

  @Test
  void teamDetailsTest() {
    List<Team> list = teamRepo.findAll();
    Assertions.assertEquals(10, list.size());
    list.stream().forEach(ele -> {
      System.out.println(ele.getTeamLabel());
      System.out.println(ele.getPlayers().size());
    });

  }

  @Test
  void teamNamesTest() {
    List<String> teamNames = teamRepo.getTeamNames();
    System.out.println(teamNames);
    Assertions.assertEquals(10, teamNames.size());
  }

  @Test
  void getTeamStatsTest(){
    System.out.println(teamRepo.getTeamAmountStats());
  }
  @Test
  void getPlayerDetails(){
    System.out.println(teamRepo.getPlayers("CSK","Batsman"));
  }

}

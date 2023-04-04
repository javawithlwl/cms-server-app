package com.careerit.cms.repo;

import com.careerit.cms.domain.Team;
import com.careerit.cms.dto.PlayerDto;
import com.careerit.cms.dto.RoleAmountDto;
import com.careerit.cms.dto.TeamAmountStatsDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TeamRepo extends JpaRepository<Team,String> {

        @Query("select teamLabel from Team")
        List<String> getTeamNames();

        @Query(value = "select new com.careerit.cms.dto.TeamAmountStatsDto(t.teamLabel,sum(p.amount)) from Player p inner join p.team t group by t.teamLabel")
        List<TeamAmountStatsDto> getTeamAmountStats();

        @Query("select new com.careerit.cms.dto.RoleAmountDto(p.role,sum(p.amount)) from Player p group by p.role")
        List<RoleAmountDto> getRoleAmountStats();

        @Query("select new com.careerit.cms.dto.PlayerDto(p.id,p.name,p.role,t.name,t.teamLabel,p.amount)  from Player p inner join p.team t  where t.teamLabel=:teamLabel")
        List<PlayerDto> getPlayers(@Param("teamLabel")String teamLabel);

}

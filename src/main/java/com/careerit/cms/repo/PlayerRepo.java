package com.careerit.cms.repo;

import com.careerit.cms.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepo extends JpaRepository<Player,Long> {
}

package com.careerit.cms.repo;

import com.careerit.cms.domain.AppUser;
import com.careerit.cms.domain.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;


@NoRepositoryBean
public interface BaseRepository<T extends BaseEntity,ID> extends JpaRepository<T,ID> {

  @Query("select a from #{#entityName} a where a.isDeleted=false")
  List<T> findAll();

}

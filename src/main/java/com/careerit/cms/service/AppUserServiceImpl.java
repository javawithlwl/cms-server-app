package com.careerit.cms.service;

import com.careerit.cms.domain.AppUser;
import com.careerit.cms.repo.AppUserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class AppUserServiceImpl implements AppUserService {

  private final AppUserRepo appUserRepo;

  @Transactional
  @Override
  public AppUser addUser(AppUser appUser) {
    Assert.notNull(appUser, "Appuser can not be null");
    Assert.hasText(appUser.getUsername(), "Username can not be null or empty");
    Assert.hasText(appUser.getPassword(), "Password can not be null or empty");
    Assert.hasText(appUser.getEmail(), "Email can not be null or empty");
    AppUser addedUser = appUserRepo.save(appUser);
    log.info("User is added with id :{}", addedUser.getId());
    return addedUser;
  }

  @Override
  public List<AppUser> getActiveUsers() {
    List<AppUser> list = appUserRepo.findAll();
    log.info("Total active user count :{}", list.size());
    return list;
  }

  @Transactional
  @Override
  public AppUser updateUser(AppUser appUser) {
    Assert.notNull(appUser, "Appuser can not be null");
    Assert.notNull(appUser.getId(), "Updated user id can not null or empty");
    Assert.hasText(appUser.getUsername(), "Username can not be null or empty");
    Assert.hasText(appUser.getPassword(), "Password can not be null or empty");
    Assert.hasText(appUser.getEmail(), "Email can not be null or empty");
    AppUser updatedUser = appUserRepo.save(appUser);
    log.info("User is update of id :{}", updatedUser.getId());
    return updatedUser;
  }
}

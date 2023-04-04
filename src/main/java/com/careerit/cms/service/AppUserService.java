package com.careerit.cms.service;

import com.careerit.cms.domain.AppUser;

import java.util.List;

public interface AppUserService {

      AppUser addUser(AppUser appUser);
      List<AppUser> getActiveUsers();
      AppUser updateUser(AppUser appUser);
}

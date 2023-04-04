package com.careerit.cms;

import com.careerit.cms.domain.AppUser;
import com.careerit.cms.repo.TeamRepo;
import com.careerit.cms.service.AppUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@SpringBootApplication
@Slf4j
public class CmsServerAppApplication implements CommandLineRunner {

  @Autowired
  private AppUserService appUserService;
  public static void main(String[] args) {
    SpringApplication.run(CmsServerAppApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
//        List<AppUser> list = getList();
//        for(AppUser obj:list){
//            appUserService.addUser(obj);
//        }
          appUserService.getActiveUsers().forEach(ele->{
            System.out.println(ele.getUsername());
          });
  }

  private List<AppUser> getList() {
    AppUser obj1 = new AppUser();
    obj1.setUsername("krish");
    obj1.setPassword("krish@123");
    obj1.setEmail("krish.t@gmail.com");

    AppUser obj2 = new AppUser();
    obj2.setUsername("john");
    obj2.setPassword("john@123");
    obj2.setEmail("john.j@gmail.com");
    return List.of(obj1, obj2);
  }

}

package com.careerit.cms.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "app_user")
@Getter
@Setter
public class AppUser extends BaseEntity {
  @Id
  @Column(name = "id")
  private UUID id;
  @Column(name="username")
  private String username;
  @Column(name = "password")
  private String password;
  @Column(name = "email")
  private String email;
  @Column(name = "is_deleted")
  private boolean isDeleted;

  @PrePersist
  @Override
  public void onPersists() {
        this.id = UUID.randomUUID();
  }
}

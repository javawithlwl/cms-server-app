package com.careerit.cms.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "todo_details")
@Getter
@Setter
public class Todo extends BaseEntity {

      @Id
      private UUID id;
      @Column(name = "title")
      private String title;
      @Column(name = "todo_desc")
      private String todoDesc;
      @Column(name = "is_deleted")
      private boolean isDeleted;

  @Override
  public void onPersists() {
      this.id = UUID.randomUUID();
  }
}

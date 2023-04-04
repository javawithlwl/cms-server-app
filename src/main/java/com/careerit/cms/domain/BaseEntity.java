package com.careerit.cms.domain;

import com.careerit.cms.util.SecurityContextUtil;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.UUID;

@MappedSuperclass
public abstract class BaseEntity {

        @Column(nullable = false,updatable = false,name = "created_by")
        private UUID createdBy;

        @Column(nullable = false,updatable = true,name="modified_by")
        private UUID modifiedBy;

        @Column(nullable = false,updatable = false,name = "created_at")
        private LocalDateTime createAt;

        @Column(nullable = false,updatable = true,name = "modified_at")
        private LocalDateTime modifiedAt;

        @PrePersist
        public void init(){
                this.createAt = LocalDateTime.now(ZoneOffset.UTC);
                this.modifiedAt = LocalDateTime.now(ZoneOffset.UTC);
                this.createdBy = SecurityContextUtil.getUserId();
                this.modifiedBy = SecurityContextUtil.getUserId();
        }
        @PreUpdate
        public void onUpdate(){
                this.modifiedAt = LocalDateTime.now(ZoneOffset.UTC);
                this.modifiedBy = SecurityContextUtil.getUserId();
        }
        public abstract void onPersists();
}

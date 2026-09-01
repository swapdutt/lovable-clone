package com.lovable.entity;

import com.lovable.entity.enums.ProjectMemberRoles;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectMember {

    ProjectMemberId id;
    Project project;
    User user;
    ProjectMemberRoles role;
    Instant invitedAt;
    Instant acceptedAt;


}

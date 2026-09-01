package com.lovable.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Project {

    Long id;
    String name;
    User owner;
    Boolean isPublic;
    Instant createdAt;
    Instant updatedAt;
    Instant deletedAt;

}

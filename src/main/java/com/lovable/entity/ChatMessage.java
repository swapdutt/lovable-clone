package com.lovable.entity;

import com.lovable.entity.enums.MessageRoles;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatMessage {

    Long id;
    ChatSession chatSession;
    MessageRoles roles;
    String content;
    String toolCalls;
    Integer tokensUsed;
    Instant createdAt;

}

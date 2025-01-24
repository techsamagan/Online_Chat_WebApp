package com.samagan.chatApplication.chat;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {

    private String content;
    private String sender;
    private MessageType type;

    // Lombok @Getter annotation will automatically generate the getter for 'sender'
    // No need to manually define getSender() here.

    // Constructor without the 'type' field, if necessary
    public ChatMessage(String content, String sender) {
        this.content = content;
        this.sender = sender;
    }
}

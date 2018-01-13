package com.walking.techie.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Message {
    private Long id;
    private String message;

    public Message(String message) {
        this.message = message;
    }
}
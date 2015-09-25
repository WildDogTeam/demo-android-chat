package com.wilddog.androidchat;

/**
 * @author Jeen
 * @since 9/16/15
 */
public class Chat {

    private String message;
    private String author;

    // Required default constructor for Wilddog object mapping
    @SuppressWarnings("unused")
    private Chat() {
    }

    Chat(String message, String author) {
        this.message = message;
        this.author = author;
    }

    public String getMessage() {
        return message;
    }

    public String getAuthor() {
        return author;
    }
}

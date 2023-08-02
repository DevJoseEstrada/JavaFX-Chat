package com.devjmestrada.chatfx.Singletons;
import com.devjmestrada.chatfx.Services.Impl.ChatService;
import com.devjmestrada.chatfx.Services.Interfaces.IChatService;

public class ChatServiceSingleton {
    private static final IChatService chatServiceInstance = new ChatService();

    public static IChatService getChatService() {
        return chatServiceInstance;
    }
}
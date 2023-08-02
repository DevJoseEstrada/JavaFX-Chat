package com.devjmestrada.chatfx.Singletons;


import com.devjmestrada.chatfx.DAOs.Impl.MessageDAO;
import com.devjmestrada.chatfx.DAOs.Interfaces.IMessageDAO;

public class MessageDAOSingleton {
    private static final IMessageDAO messageDAOInstance = new MessageDAO();

    public static IMessageDAO getMessageDAO() {
        return messageDAOInstance;
    }
}

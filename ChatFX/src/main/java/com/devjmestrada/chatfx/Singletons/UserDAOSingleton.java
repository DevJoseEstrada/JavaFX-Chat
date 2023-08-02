package com.devjmestrada.chatfx.Singletons;

import com.devjmestrada.chatfx.DAOs.Impl.UserDAO;
import com.devjmestrada.chatfx.DAOs.Interfaces.IUserDAO;

public class UserDAOSingleton {
    private static final IUserDAO userDAOInstance = new UserDAO();
    public static IUserDAO getUserDAO() {
        return userDAOInstance;
    }
}

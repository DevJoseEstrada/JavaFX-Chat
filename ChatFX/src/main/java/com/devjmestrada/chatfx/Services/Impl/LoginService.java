package com.devjmestrada.chatfx.Services.Impl;

import com.devjmestrada.chatfx.DAOs.Interfaces.IUserDAO;
import com.devjmestrada.chatfx.Services.Interfaces.ILoginService;
import com.devjmestrada.chatfx.Singletons.UserDAOSingleton;
import com.devjmestrada.chatfx.Entities.User;

import java.sql.SQLException;

public class LoginService implements ILoginService {
    private final IUserDAO userDAO;

    public LoginService() {
        this.userDAO = UserDAOSingleton.getUserDAO();
    }

    @Override
    public User getUserId(User user) throws SQLException {
        return userDAO.getUserId(user);
    }

    @Override
    public void create(User entity) throws SQLException {
        userDAO.create(entity);
    }
}

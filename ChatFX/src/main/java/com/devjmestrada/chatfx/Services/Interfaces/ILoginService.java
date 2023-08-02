package com.devjmestrada.chatfx.Services.Interfaces;

import com.devjmestrada.chatfx.Entities.User;

import java.sql.SQLException;

public interface ILoginService {
    User getUserId(User user) throws SQLException;
    void create(User entity) throws SQLException;
}

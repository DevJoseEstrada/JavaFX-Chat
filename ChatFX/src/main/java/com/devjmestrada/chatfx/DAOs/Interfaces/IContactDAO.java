package com.devjmestrada.chatfx.DAOs.Interfaces;

import com.devjmestrada.chatfx.Entities.Contact;
import javafx.collections.ObservableList;

import java.sql.SQLException;

public interface IContactDAO extends IBaseDAO<Contact>{

    ObservableList<Contact> getUserContacts(int userId) throws SQLException;
    boolean checkBlocked(int userId, int chatId) throws SQLException;
    void blockUnblockContact(int userId, int contactId, boolean isBlocked) throws SQLException;
    void addContact(int userId, int contactId) throws SQLException;
}
